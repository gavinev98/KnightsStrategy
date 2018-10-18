import com.sun.org.apache.bcel.internal.generic.DREM;

import java.util.Scanner;
public class GameDriver {

    public static void main(String args[])
    {


        String name = "Gavin";
        double health = 100;
        String[] attackOptions = { "Rage Spell"};
        String[] specialAbility = { "Cold Spell"};
        String[] clothingOptions = {"Blue Hair"};

        String name1 = "John";
        double health1 = 67;
        String[] attackOptions1 = { "Rage Spell"};
        String[] specialAbility1 = { "Cold Spell"};
        String[] clothingOptions1 = {"Blue Hair"};

/* Using strategy Pattern here */
        System.out.println("Dragon Details");
        Dragon w1 = new Dragon( name, health, attackOptions, specialAbility, clothingOptions);

        System.out.println("Name :" + w1.getName());
        System.out.println("Special Attack");
        w1.attackEnemy();
        System.out.println("Health :" + w1.getHealth());

/*Using Decorator Pattern here */
        System.out.println("-------------------");
        //Applying blue hair to our character.
        CharacterType blueHairedTroll = new BlueHairDecorator(new Troll(name1, health1, attackOptions1, specialAbility1, clothingOptions1));

        System.out.println("Details of your Troll");
        System.out.println("Name :" + w1.getName());
        //Assigning blue hair to the object dynamically through the decorator pattern.
        blueHairedTroll.clothingOption();
        System.out.println("Health :" + w1.getHealth());
        /*Using Decorator Pattern here */



/* Using Factory Pattern here */
        Scanner input = new Scanner(System.in);

        Character type = null;

        String characterOptions = "";

        System.out.print("What type of character do you want to create T for Troll or D for Dragon.");

        //* Take in value from command line.
        if(input.hasNextLine())
        {
            characterOptions = input.nextLine();

        }

        //*Check what value was entered */

        if(characterOptions.equals("T"))

        {
            type = new Troll(name,health,attackOptions,specialAbility,clothingOptions);
        }

        else if(characterOptions.equals("D"))
        {
            type = new Dragon(name,health,attackOptions,specialAbility,clothingOptions);
        }


    }

    /* Using Factory Pattern here */
}
