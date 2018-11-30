package StrategyTests;


import Models.Character;
import Models.Troll;
import TemplateMethod.HitAndRunMethod;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

        @Test
    public void testingStrategy()
        {
            Character character = new Troll("Gavin",100,"Jacket", new HitAndRunMethod());


            String attack = "Attacking enemy with a Sword....";


            Assert.assertThat(character.getAttack(), CoreMatchers.is("Attacking enemy with a Sword...."));
        }

}
