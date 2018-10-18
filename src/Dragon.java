public class Dragon extends Character implements CharacterType,  IsAlive {


    public Dragon(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
        fightingOptions = new BreathFire();
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Dragon Details:");
    }
}
