package Models;
import Interface.*;

import Decorator.CharacterClothing;
import Models.Character;
import TemplateMethod.LootMethod;

public class Warrior extends Character implements CharacterClothing, IsAlive {


    public Warrior(String name, double health, String attackOptions, String clothingOptions, LootMethod method) {
            super(name, health, attackOptions, clothingOptions, method);
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Hair Color:");
    }
}
