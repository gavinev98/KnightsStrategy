package Strategy;

import Strategy.FightingOptions;

public class CastSpell implements FightingOptions {


    @Override
    public void attack() {
        System.out.println("Special Ability: Casting Spell");
    }
}
