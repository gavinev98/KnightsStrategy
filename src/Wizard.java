import java.util.Arrays;

public class Wizard {

    String name = "Wonderful Wizard";
    double health = 100;
    String[] attackOptions = new String[]{ "Magic Stick","Arrows" };
    String[] specialAbility = new String[] {"Rage Spell", "Freeze Spell"};
    String[] clothingOptions = new String[] {"Blue Wand", "Yellow Wand"};

    public Wizard(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions)
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
