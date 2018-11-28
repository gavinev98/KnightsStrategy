package State;

import Models.Character;

public class WalkingState implements State {


    @Override
    public void playerState(Character character) {
        System.out.println("Your character is currently walking around.");
        character.setState(this);
    }
}
