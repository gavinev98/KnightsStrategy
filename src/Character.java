

import TemplateMethod.LootMethod;



import java.util.ArrayList;




public class Character implements Subject {
    FightingOptions fightingOptions;
    LootMethod methods;
    private ArrayList<Observer> observers;
    String name;
    double health;
    String attackOptions;
    String specialAbility;
    String clothingOptions;

    public Character(String name, double health, String attackOptions, String specialAbility, String clothingOptions, LootMethod methods) {
        this.name = name;
        this.health = health;
        this.attackOptions = attackOptions;
        this.specialAbility = specialAbility;
        this.clothingOptions = clothingOptions;
        this.methods = methods;
        this.observers = new ArrayList();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
        this.healthChanged();
    }

    public void setAttackOptions(String attackOptions) {
        this.attackOptions = attackOptions;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public void setClothingOptions(String clothingOptions) {
        this.clothingOptions = clothingOptions;
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public String getAttackOptions() {
        return this.attackOptions;
    }

    public String getSpecialAbility() {
        return this.specialAbility;
    }

    public String getClothingOptions() {
        return this.clothingOptions;
    }

    public void setAttack(FightingOptions fight) {
        this.fightingOptions = fight;
    }

    public void attackEnemy() {
        this.fightingOptions.attack();
    }

    public void healthChanged() {
        this.notifyObserver();
    }

    public void steal() {
        this.methods.Loot();
    }

    public String toString() {
        return "Name" + this.getName() + "Health" + this.getHealth() + "Attack Options" + this.getAttackOptions() + "Special Ability" + this.getSpecialAbility() + "Clothing Options" + this.getClothingOptions();
    }

    public void register(Observer o) {
        this.observers.add(o);
    }

    public void unregister(Observer obs) {
        int i = this.observers.indexOf(obs);
        if (i >= 0) {
            this.observers.remove(i);
        }

    }

    public void notifyObserver() {
        for(int i = 0; i < this.observers.size(); ++i) {
            Observer observer = (Observer)this.observers.get(i);
            observer.update(this.health);
        }

    }
}

