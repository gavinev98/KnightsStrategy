import java.rmi.activation.ActivationGroup_Stub;
import java.util.Arrays;

public class Dragon extends Character implements Cosmetics,  IsAlive {


    public Dragon(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
        fightingOptions = new BreathFire();
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
