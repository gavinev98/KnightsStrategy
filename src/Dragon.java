import java.rmi.activation.ActivationGroup_Stub;
import java.util.Arrays;

public class Dragon extends Character implements FightingOptions, IsAlive {


    public Dragon(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        super(name, health, attackOptions, specialAbility, clothingOptions);
    }

    public String getName()
    {
        return name;
    }

    public double getHealth()
    {
        return health;
    }

    public String[] getAttackOptions()
    {
        return attackOptions;
    }

    public String[] getSpecialAbility()
    {
        return specialAbility;
    }

    public String[] getClothingOptions()
    {
        return clothingOptions;
    }

    public String toString()
    {
        return "Name" + getName() + "Health" + getHealth() + "Attack Options" + Arrays.toString(attackOptions) + "Special Ability" + Arrays.toString(specialAbility) + "Clothing Options" + Arrays.toString(clothingOptions);
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
