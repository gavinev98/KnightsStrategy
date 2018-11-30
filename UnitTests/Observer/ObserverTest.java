package Observer;

import Models.*;
import Models.Character;
import TemplateMethod.HitAndRunMethod;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void playerAlive() {
        Character typeOfCharacter = new Troll("Gavin", 100, "Jacket", new HitAndRunMethod());

        GameSoundObserver soundObserver1 = new GameSoundObserver(typeOfCharacter);


    }
}
