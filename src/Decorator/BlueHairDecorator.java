package Decorator;

import Decorator.CosmeticDecorator;

public class BlueHairDecorator extends CosmeticDecorator {

    public BlueHairDecorator(CharacterClothing cosmos)
    {
        super(cosmos);

    }

    @Override
    public void clothingOption() {
        super.clothingOption();
        System.out.println("Blue Hair applied");

    }



}
