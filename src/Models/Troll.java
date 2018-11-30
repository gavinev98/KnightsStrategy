package Models;

import Decorator.CharacterClothing;
import Models.Character;
import State.*;
import Strategy.TrollSword;
import TemplateMethod.LootMethod;
import Interface.*;

public class Troll extends Character implements CharacterClothing, IsAlive {

    public Troll(String name, double health, String clothingOptions, LootMethod method) {
        super(name, health, clothingOptions, method);
        fightingOptions = new TrollSword();


    }


    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Green Hair");
    }


}
