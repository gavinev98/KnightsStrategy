package Decorator;

import Decorator.CosmeticDecorator;

public class HairDecorator extends CosmeticDecorator {

    public HairDecorator(CharacterClothing cosmos)
    {
        super(cosmos);

    }

    @Override
    public void clothingOption() {
        super.clothingOption();
        System.out.println("Applied");

    }



}
