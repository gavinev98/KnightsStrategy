import java.rmi.activation.ActivationGroup_Stub;
import java.util.Arrays;

public class Dragon extends Character implements FightingOptions, IsAlive {


    public Dragon(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
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
