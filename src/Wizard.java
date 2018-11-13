public class Wizard extends Character implements CharacterType, IsAlive {

    public Wizard(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions, LootMethod methods) {
        super(name, health, attackOptions, specialAbility, clothingOptions, methods);
    }


    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Wizard Hair Color:");
    }



}
