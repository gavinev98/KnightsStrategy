package GameDriver;

import Decorator.HairDecorator;
import Decorator.CharacterClothing;
import Models.Character;
import Observer.*;
import FactoryMethod.*;
import State.WalkingState;

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
        if(typeofchar.equals("T")) {
            System.out.println("Your attack option is a sword for this character");
        }
        else if(typeofchar.equals("D"))
        {
            System.out.println("Your attack option is breathing fire for this character");
        }
        System.out.print("What Clothing options do you want to wear :");
        String clothingopts = input.nextLine();

        if (input.hasNextLine()) {


            typeOfCharacter = type.createCharacter(typeofchar, nameOfChar, healthval,clothingopts);

            if (typeOfCharacter != null) {
                // I will create methods here for adding blue hair / using stealing methods / loosing health for observer etc.
                Scanner input1 = new Scanner(System.in);
                //Observer.Observer for my game monitoring health.
                GameSoundObserver soundObserver1 = new GameSoundObserver(typeOfCharacter);
                WalkingState state = new WalkingState();

                System.out.println("Character sucessfully created");

                System.out.println("-----------------------");

                state.playerState(typeOfCharacter);


                System.out.print("There is a wizard nearby do you wish to perform a hit and run? Y OR N :");
                String perform = input1.nextLine();
                System.out.println("");

                if(perform.equals("Y")) {
                    typeOfCharacter.steal();

                    System.out.println("You have been caught and the wizard has hit you with a spell!!");
                    //Showing off the use of the observer. Once the health gets updated it will notify and observer and will output message of character status.
                    typeOfCharacter.setHealth(50);
                    System.out.println("Your health is pretty low get to cover :" + typeOfCharacter.getHealth());

                    System.out.println("*bandages up and tries to identify location of wizard");
                    System.out.println("Wizard spotted do you wish to engage in fighting? Y OR N");
                    String fighting = input1.nextLine();

                    if(fighting.equals("Y")) {
                        typeOfCharacter.attackEnemy();
                    }

                    else
                    {
                        System.out.println("Not attacking the enemy.");
                        System.out.println("Game Over");
                    }

                    System.out.println("Wizard has hit you again!!");
                    typeOfCharacter.setHealth(-1);


                    System.out.println("Game Over");
                }

                else
                {
                    System.out.println("Not attacking the enemy.");
                    System.out.println("Game Over");
                }

                System.out.println("-----------------------");






                System.out.print("Do you wish to apply hair to your character ? Y OR N :");
                String applyhair = input1.nextLine();

                if(applyhair.equals("Y")) {

                    CharacterClothing applyClothing = new HairDecorator(typeOfCharacter);
                    applyClothing.clothingOption();

                    System.out.println("------------------");

                    System.out.println("Here is an updated view of your characters details");
                    System.out.println("Name: " + typeOfCharacter.getName());
                    System.out.println("Health: " + typeOfCharacter.getHealth());
                    System.out.println("Clothing Options :" + typeOfCharacter.getClothingOptions());
                    System.out.println("Hair Color:");  typeOfCharacter.clothingOption();
            }





            }


        }


    }
}
