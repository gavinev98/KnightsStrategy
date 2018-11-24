import TemplateMethod.LootMethod;

public class Troll extends Character implements CharacterClothing,  IsAlive {

    //Using Composition
    FightingOptions fightingOptions;

    public Troll(String name, double health, String attackOptions, String specialAbility, String clothingOptions, LootMethod method) {
        super(name, health, attackOptions, specialAbility, clothingOptions, method);
        fightingOptions = new TrollSword();
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Hair Color:");
    }
}
