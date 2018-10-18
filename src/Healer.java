public class Healer extends Character implements CharacterType,  IsAlive {


    public Healer(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Healer Hair Color :");
    }
}
