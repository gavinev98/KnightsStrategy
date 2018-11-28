package Strategy;

import Strategy.FightingOptions;

public class TrollSword implements FightingOptions {
    @Override
    public void attack() {
        System.out.println("Attacking enemy with a Sword....");
    }
}
