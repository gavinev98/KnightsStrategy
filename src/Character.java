
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;


public class Character implements Subject {

    // Using Composition to take in FightingOptions.
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
        //Calling healthChanged method when the health changes to notify the observer.
        healthChanged();

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

    public void healthChanged()
    {
        notifyObserver();
    }



    public String toString() {
        return "Name" + getName() + "Health" + getHealth() + "Attack Options" + Arrays.toString(attackOptions) + "Special Ability" + Arrays.toString(specialAbility) + "Clothing Options" + Arrays.toString(clothingOptions);
    }


    @Override
    public void register(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {

        int i = observers.indexOf(obs);
        if(i >= 0){
            observers.remove(i);
        }

    }

    @Override
    public void notifyObserver() {

        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update();
        }
    }
}
