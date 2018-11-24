import TemplateMethod.HitAndRunMethod;
import TemplateMethod.UndercoverMethod;

import java.util.Scanner;
public class GameDriver {

    public static void main(String args[]) {


        String name = "Gavin";
        double health = 100;
        String attackOptions = "Rage Spell";
        String specialAbility = "Cold Spell";
        String clothingOptions = "Blue Hair";

        String name1 = "John";
        double health1 = 67;
        String attackOptions1 = "Rage Spell";
        String specialAbility1 = "Cold Spell";
        String clothingOptions1 = "Blue Hair";

        /* Using strategy Pattern here */

        System.out.println("Dragon Details");
        Dragon w1 = new Dragon(name, health, attackOptions, specialAbility, clothingOptions, new HitAndRunMethod());
        System.out.println("Name :" + w1.getName());
        w1.attackEnemy();
        System.out.println("Health :" + w1.getHealth());
       /* **********************************/


        /*Using Decorator Pattern here */

        System.out.println("-------------------");
        System.out.println("Decorator Pattern");
        //Applying blue hair to our character.
        CharacterClothing blueHairedTroll = new BlueHairDecorator(new Troll(name1, health1, attackOptions1, specialAbility1, clothingOptions1, new HitAndRunMethod()));

        System.out.println("Details of your Troll");
        System.out.println("Name :" + w1.getName());
        //Assigning blue hair to the object dynamically through the decorator pattern.
        blueHairedTroll.clothingOption();
        System.out.println("Health :" + w1.getHealth());
        /*Using Decorator Pattern here */



        /* Using Factory Pattern here */

        System.out.println("-------------------");
        System.out.println("Factory Pattern");
        Scanner input = new Scanner(System.in);

        CharacterFactory type = new CharacterFactory(new SimpleCharacterFactory());

        Character typeOfCharacter = null;

        System.out.print("What type of character would you like to create ? T(Troll) or D(Dragon):");
        String typeofchar = input.nextLine();
        System.out.print("What do you want to call you desired character :");
        String nameOfChar = input.nextLine();
        System.out.print("What health do you want to give your character:");
        double healthval = Double.parseDouble(input.nextLine());
        System.out.print("What attack options do you want to give your character:");
        String attkOptions = input.nextLine();
        System.out.print("What special abilities do you need?");
        String specials = input.nextLine();
        System.out.print("What Clothing options do you want to wear");
        String clothingopts = input.nextLine();

        if (input.hasNextLine()) {


            typeOfCharacter = type.createCharacter(typeofchar, nameOfChar, healthval, attkOptions, specials, clothingopts);


        }

        if (typeOfCharacter != null) {
            // I will create methods here for adding blue hair / using stealing methods / loosing health for observer etc.

            System.out.println("Character sucessfully created");


            System.out.println("Welcome to the command line fighting game !");

            System.out.println("Here are your players details");

            System.out.println("Name :" + typeOfCharacter.getName());
            System.out.println("Health" + typeOfCharacter.getHealth());
            System.out.println("Clothing Options" + typeOfCharacter.getClothingOptions());
            System.out.println("Attacking Options" + typeOfCharacter.getAttackOptions());
            System.out.println("Special Ability" + typeOfCharacter.getSpecialAbility());
            System.out.println("Your powerup cant be changed and is HitAndRun");

            System.out.println("Would you like to decorate your character?");
            String yorn = input.nextLine();

            if(yorn.equals("Y"))
            {
                typeOfCharacter = new BlueHairDecorator(typeOfCharacter);
                System.out.println("Cosmestic of blue hair applied" + typeOfCharacter.clothingOption();
            }
            else
            {

            }






        } else {
            System.out.print("Error character not specified!");
        }

        /* Using Factory Pattern here */



        /* Using Observer Pattern here */

        System.out.println("-------------------");
        System.out.println("Observer Pattern");

        // Creating a new Character
        Character obscharacter = new Dragon(name,health,attackOptions,specialAbility,clothingOptions, new HitAndRunMethod());

        System.out.println("Name :" + obscharacter.name);
        System.out.println("Health :" + obscharacter.health);
        System.out.println("Attack Options :" + obscharacter.attackOptions);
        System.out.println("Special Ability :" + obscharacter.specialAbility);
        System.out.println("Clothing :" + obscharacter.clothingOptions);


        // Creating the Game Sound Observer to Listen if the health is less than 0.
        GameSoundObserver soundObserver1 = new GameSoundObserver(obscharacter);
        obscharacter.setHealth(-1);


        /* Observer Pattern ends here */




        /* Using the Template method here */


        System.out.println("-------------------");
        System.out.println("Template Method");

        Character goblin = new Troll(name,health,attackOptions,specialAbility,clothingOptions, new UndercoverMethod());

        System.out.println("My Character is about to steal from you!");
        goblin.steal();

        /* End of the Template Method. */



    }







}
