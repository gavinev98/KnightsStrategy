
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

import java.util.Observable;
import java.util.Observer;

public class GameSoundObserver implements Observer{

    //creating boolean variable to play sound.
    private boolean isSoundPlaying = false;

    Observable observable;

    //Access to this to be able to use different methods using dependency injection. we need to have this to register objects in here.
    private Subject concreteSubject;


    // creating constructor using dependency injection and registering the GameSound Observer.
    public GameSoundObserver(Observable observable)
    {
        this.observable = observable;

        // add to concrete subjects arraylist.
        observable.addObserver(this);
    }


    public void characterHealth()
    {
        System.out.println("Your Character has died");

        try
        {
            String bip = "C:/Users/Gavin Everett/Downloads/dragon.mp3";
            Media hit = new Media(new File(bip).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
        }
        catch(Exception e)
        {
            System.out.println("Error Playing Music");
        }

        isSoundPlaying = true;
    }

    // The goal of this update method is to play music when dragon is entered as the name.
    @Override
    public void update(Observable observer, Object arg) {

        if(observer instanceof Character)
        {
            Character character1 = (Character)observer;
            double dragonsHealth = character1.getHealth();
            if(dragonsHealth < 0)
            {
                characterHealth();
            }
            else {
                System.out.println("Your Character is still alive");
            }
        }
    }
}
