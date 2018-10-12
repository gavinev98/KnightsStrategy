import java.util.Arrays;

public class Troll extends Character implements Cosmetics,  IsAlive {


    public Troll(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public String clothingOption() {
        return "Warrior has blue hair";
    }
}
