package Strategy;

import Strategy.FightingOptions;

public class WarriorSword implements FightingOptions {
    @Override
    public void attack() {
        System.out.println("warrior sword");
    }
}