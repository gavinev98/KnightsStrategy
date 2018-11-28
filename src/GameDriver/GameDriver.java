package GameDriver;

import Decorator.BlueHairDecorator;
import Decorator.CharacterClothing;
import Models.Character;
import Observer.*;
import FactoryMethod.*;

import java.util.Scanner;
public class GameDriver {

    public static void main(String args[]) {


        /* Using Factory Pattern here */

        System.out.println("-------------------");
        System.out.println("Welcome to Command line Fighting game!");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);


        CharacterFactory type = new CharacterFactory(new SimpleCharacterFactory());

        Character typeOfCharacter = null;

        System.out.print("What type of character would you like to create ? T(Troll) or D(Dragon):");
        String typeofchar = input.nextLine();
        System.out.print("What do you want to call you desired character :");
        String nameOfChar = input.nextLine();
        System.out.print("What health do you want to give your character:");
        double healthval = Double.parseDouble(input.nextLine());
        System.out.print("What attack options do you want ?");
        String attackoptions = input.nextLine();
        System.out.print("What Clothing options do you want to wear");
        String clothingopts = input.nextLine();

        if (input.hasNextLine()) {


            typeOfCharacter = type.createCharacter(typeofchar, nameOfChar, healthval,attackoptions,clothingopts);


        }

        if (typeOfCharacter != null) {
            // I will create methods here for adding blue hair / using stealing methods / loosing health for observer etc.

            //Observer.Observer for my game monitoring health.
            GameSoundObserver soundObserver1 = new GameSoundObserver(typeOfCharacter);

            System.out.println("Character sucessfully created");

            System.out.println("-----------------------");


            System.out.print("There is a wizard nearby do you wish to perform a hit and run?");
            System.out.println("");
            typeOfCharacter.steal();

            System.out.println("You have been caught and the wizard has hit you with a spell!!");
            //Showing off the use of the observer. Once the health gets updated it will notify and observer and will output message of character status.
            typeOfCharacter.setHealth(50);
            System.out.println("Your health is pretty low get to cover :" + typeOfCharacter.getHealth());

            System.out.println("*bandages up and tries to identify location of wizard");
            System.out.println("Wizard spotted engaging!");
            typeOfCharacter.attackEnemy();

            System.out.println("Wizard has hit you again!!");
            typeOfCharacter.setHealth(-1);


            System.out.println("Game Over");

            System.out.println("-----------------------");


            System.out.print("Do you wish to apply blue hair to your character ?");
            String applyhair = input.nextLine();

                CharacterClothing applyClothing = new BlueHairDecorator(typeOfCharacter);
                applyClothing.clothingOption();



        }
    }
}
