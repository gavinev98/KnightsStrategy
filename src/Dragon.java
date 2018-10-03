import java.rmi.activation.ActivationGroup_Stub;
import java.util.Arrays;

public class Dragon {

    String name = "Spyro The Dragon";
    double health = 100;
    String[] attackOptions = new String[]{ "Breath Fire","Tale Swing" };
    String[] specialAbility = new String[] {"Deal 100 Damage", "Sumo"};
    String[] clothingOptions = new String[] {"Red Hat", "Yellow Hat"};

    public Dragon(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions)
    {
        this.name = name;
        this.health = health;
        this.attackOptions = attackOptions;
        this.specialAbility = specialAbility;
        this.clothingOptions = clothingOptions;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHealth(double health)
    {
        this.health = health;
    }

    public void setAttackOptions(String[] attackOptions)
    {
        this.attackOptions = attackOptions;
    }

    public void setSpecialAbility(String[] specialAbility)
    {
        this.specialAbility = specialAbility;
    }

    public void setClothingOptions(String[] clothingOptions)
    {
        this.clothingOptions = clothingOptions;
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






}
