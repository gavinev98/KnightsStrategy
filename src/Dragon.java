
import TemplateMethod.LootMethod;

public class Dragon extends Character  implements CharacterClothing,  IsAlive {




    public Dragon(String name, double health, String attackOptions, String specialAbility, String clothingOptions, LootMethod method) {
        super(name, health, attackOptions, specialAbility, clothingOptions, method);
        fightingOptions = new BreathFire();

    }



    public void attackEnemy() {
        fightingOptions.attack();
    }


    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Hair Color:");
    }


    @Override
    public String getName() {
        return "Dragon";
    }

    @Override
    public double getHealth() {

        return 50;
    }
}
