import java.util.Arrays;

public class Warrior extends Character implements Cosmetics,  IsAlive {


    public Warrior(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
    }


    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void changeClothing() {

    }
}
