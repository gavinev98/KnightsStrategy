public class GameDriver {

    public static void main(String args[])
    {
        String name = "Gavin";
        double health = 100;
        String[] attackOptions = { "Rage Spell"};
        String[] specialAbility = { "Cold Spell"};
        String[] clothingOptions = {"Blue Hair"};

        Dragon w1 = new Dragon( name, health, attackOptions, specialAbility, clothingOptions);

        w1.attackEnemy();


    }
}
