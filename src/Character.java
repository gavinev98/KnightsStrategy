
import java.util.ArrayList;
import java.util.Arrays;



public class Character implements Subject {

    // Using Composition to take in FightingOptions.
    FightingOptions fightingOptions;

    //Using composition to implement stealing methods
    LootMethod methods;

    //Arraylist used for storing observers.
    private ArrayList<Observer> observers;


    String name;
    double health;
    String[] attackOptions;
    String[] specialAbility;
    String[] clothingOptions;

    public Character(String name, double health, String[] attackOptions, String[] specialAbility, String[] clothingOptions, LootMethod methods) {
        this.name = name;
        this.health = health;
        this.attackOptions = attackOptions;
        this.specialAbility = specialAbility;
        this.clothingOptions = clothingOptions;
        this.methods = methods;
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

    //Method used to steal.
    public void steal()
    {
        methods.Loot();
    }


    public String toString() {
        return "Name" + getName() + "Health" + getHealth() + "Attack Options" + Arrays.toString(attackOptions) + "Special Ability" + Arrays.toString(specialAbility) + "Clothing Options" + Arrays.toString(clothingOptions);
    }


    @Override
    public void register(Observer o) {
        observers.add(o);
    }


    @Override
    public void unregister(Observer obs) {

        int i = observers.indexOf(obs);
        if(i >= 0){
            observers.remove(i);
        }

    }

    // Notify all observers when the characters health goes below 0.
    @Override
    public void notifyObserver() {

        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(health);
        }
    }
}
