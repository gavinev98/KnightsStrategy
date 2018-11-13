public class Warrior extends Character implements CharacterType,  IsAlive {


    public Warrior(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions, LootMethod method) {
        super(name, health, attackOptions, specialAbility, clothingOptions, method);
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Warrior Hair Color:");
    }
}
