package StateTests;

import Models.Character;
import Models.Troll;
import State.WalkingState;
import TemplateMethod.HitAndRunMethod;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class StateTest {

    @Test
    public void testingStrategy()
    {
        Character character = new Troll("Gavin",100,"Jacket", new HitAndRunMethod());

        WalkingState state = new WalkingState();

        character.setState(state);


        Assert.assertThat(character.getState(), CoreMatchers.is("Your character is currently walking around."));
    }
}
