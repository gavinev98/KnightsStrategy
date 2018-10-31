import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observer;


public class Character implements Subject {

    FightingOptions fightingOptions;
    private ArrayList<Observer> observers;


    String name;
    double health;
    String[] attackOptions;
    String[] specialAbility;
    String[] clothingOptions;

    public Character(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions) {
        this.name = name;
        this.health = health;
        this.attackOptions = attackOptions;
        this.specialAbility = specialAbility;
        this.clothingOptions = clothingOptions;
        observers = new ArrayList<Observer>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setAttackOptions(String[] attackOptions) {
        this.attackOptions = attackOptions;
    }

    public void setSpecialAbility(String[] specialAbility) {
        this.specialAbility = specialAbility;
    }

    public void setClothingOptions(String[] clothingOptions) {
        this.clothingOptions = clothingOptions;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public String[] getAttackOptions() {
        return attackOptions;
    }

    public String[] getSpecialAbility() {
        return specialAbility;
    }

    public String[] getClothingOptions() {
        return clothingOptions;
    }

    public void setAttack(FightingOptions fight) {
        fightingOptions = fight;
    }


    public void attackEnemy() {
        fightingOptions.attack();
    }


    public String toString() {
        return "Name" + getName() + "Health" + getHealth() + "Attack Options" + Arrays.toString(attackOptions) + "Special Ability" + Arrays.toString(specialAbility) + "Clothing Options" + Arrays.toString(clothingOptions);
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }


    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);

        observers.remove(observerIndex);
    }



    @Override
    public void notifyObserver() {

        for (Observer o : observers) {
            o.update(this);

        }
    }

}
