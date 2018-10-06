import java.util.Arrays;

public class Warrior extends Character implements FightingOptions, IsAlive {


    public Warrior(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
    }



    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double specialAbility() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
