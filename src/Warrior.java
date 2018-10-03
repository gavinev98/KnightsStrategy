import java.util.Arrays;

public class Warrior {

    String name = "Elixir God";
    double health = 120;
    String[] attackOptions = new String[]{ "Golden Sword","Arrows" };
    String[] specialAbility = new String[] {"Deal More Damage", "1 hit kill"};
    String[] clothingOptions = new String[] {"Blue Helmet", "Backapack"};

    public Warrior(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions)
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
