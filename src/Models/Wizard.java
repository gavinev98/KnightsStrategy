package Models;
import Interface.*;

import Decorator.CharacterClothing;
import Models.Character;
import TemplateMethod.LootMethod;

public class Wizard extends Character implements CharacterClothing, IsAlive {

    public Wizard(String name, double health,  String clothingOptions, LootMethod methods) {
        super(name, health, clothingOptions, methods);
    }


    @Override
    public boolean isAlive() {
        return false;
    }


    @Override
    public void clothingOption() {
        System.out.println("Purple Hair");
    }




}
