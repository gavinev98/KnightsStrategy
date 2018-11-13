public class Troll extends Character implements CharacterType,  IsAlive {


    public Troll(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions, LootMethod method) {
        super(name, health, attackOptions, specialAbility, clothingOptions, method);
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Troll Hair Color :");
    }
}
