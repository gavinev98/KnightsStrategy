package Models;

import Decorator.CharacterClothing;
import Models.Character;
import TemplateMethod.LootMethod;
import Interface.*;

public class Healer extends Character implements CharacterClothing, IsAlive {


    public Healer(String name, double health, String clothingOptions, LootMethod method) {
        super(name, health, clothingOptions, method);
    }




    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Healer Hair Color :");
    }



}
