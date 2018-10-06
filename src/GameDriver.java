public class GameDriver {

    public static void main(String args[])
    {
        String name = "Gavin";
        double health = 100;
        String[] attackOptions = { "Rage Spell"};
        String[] specialAbility = { "Cold Spell"};
        String[] clothingOptions = {"Blue Hair"};

        Wizard w1 = new Wizard( name, health, attackOptions, specialAbility, clothingOptions);

       String test = w1.getName();

        System.out.print(test);
    }
}
