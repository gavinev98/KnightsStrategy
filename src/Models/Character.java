package Models;

import Observer.*;
import Decorator.CharacterClothing;
import Observer.Observer;
import Strategy.FightingOptions;
import TemplateMethod.LootMethod;



import java.util.ArrayList;




public  class Character implements Subject, CharacterClothing {

    FightingOptions fightingOptions;
    LootMethod methods;

    private ArrayList<Observer> observers;
    String name;
    double health;
    String attackOptions;
    String specialAbility;
    String clothingOptions;

 



    public Character(String name, double health, String attackOptions, String clothingOptions, LootMethod methods) {
        this.name = name;
        this.health = health;
        this.attackOptions = attackOptions;
        this.clothingOptions = clothingOptions;
        this.methods = methods;
        this.observers = new ArrayList();
    }


    public void setHealth(double health) {
        this.health = health;
        this.healthChanged();
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
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

    //Attack enemy used for strategy.
    public void attackEnemy() {
        this.fightingOptions.attack();
    }

    // HealthChanged Method to notify observers.
    public void healthChanged() {
        this.notifyObserver();
    }

    //Stealing Method used with Template Method.

    public void steal() {
        this.methods.Loot();
    }

    public String toString() {
        return "Name" + this.getName() + "Health" + this.getHealth() + "Special Ability" + this.getSpecialAbility() + "Clothing Options" + this.getClothingOptions();
    }

// This is for the decorator pattern. I was going to make it abstract instead of interface but complications arose.
    @Override
    public void clothingOption() {/* TODO */}





    //Registering Observers
    public void register(Observer o) {
        this.observers.add(o);
    }

    //Unregistering Observers
    public void unregister(Observer obs) {
        int i = this.observers.indexOf(obs);
        if (i >= 0) {
            this.observers.remove(i);
        }

    }

    //Notifying Observers.
    public void notifyObserver() {
        for(int i = 0; i < this.observers.size(); ++i) {
            Observer observer = (Observer)this.observers.get(i);
            observer.update(this.health);
        }

    }

}

