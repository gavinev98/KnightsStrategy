package Models;

import Interface.*;

import Decorator.CharacterClothing;
import Models.Character;
import Strategy.BreathFire;
import TemplateMethod.LootMethod;

public class Dragon extends Character implements CharacterClothing, IsAlive {




    public Dragon(String name, double health, String attackOptions, String clothingOptions, LootMethod method) {
        super(name, health, attackOptions, clothingOptions, method);
        fightingOptions = new BreathFire();

    }






    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Hair Color:");
    }


    @Override
    public String getName() {
        return "Models.Dragon";
    }

    @Override
    public double getHealth() {

        return 50;
    }
}
