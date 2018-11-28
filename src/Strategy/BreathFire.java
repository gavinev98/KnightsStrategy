package Strategy;

import Strategy.FightingOptions;

public class BreathFire implements FightingOptions {


    @Override
    public void attack() {
      System.out.println("Special Ability Used: Breathing Fire");
    }


}
