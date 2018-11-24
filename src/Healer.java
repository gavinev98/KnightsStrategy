import TemplateMethod.LootMethod;

public class Healer extends Character implements CharacterClothing,  IsAlive {


    public Healer(String name, double health, String attackOptions, String specialAbility, String clothingOptions, LootMethod method) {
        super(name, health, attackOptions, specialAbility, clothingOptions, method);
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
