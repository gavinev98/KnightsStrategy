package Models;

import Interface.*;

import Decorator.CharacterClothing;
import Models.Character;
import Strategy.BreathFire;
import TemplateMethod.LootMethod;

public class Dragon extends Character implements CharacterClothing, IsAlive {




    public Dragon(String name, double health, String clothingOptions, LootMethod method) {
        super(name, health, clothingOptions, method);
        fightingOptions = new BreathFire();

    }






    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Blue Hair");
    }




    @Override
    public String getName() {
        return "Dragon";
    }

    @Override
    public double getHealth() {

        return 50;
    }
}
