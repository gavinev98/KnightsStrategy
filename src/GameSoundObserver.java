


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;



public class GameSoundObserver implements Observer{

    //creating boolean variable to play sound.
    private boolean isSoundPlaying = false;

    Subject concreteSubject;

    // creating constructor using dependency injection and registering the GameSound Observer.
    public GameSoundObserver(Subject concreteSubject)
    {
        this.concreteSubject = concreteSubject;

        // add to concrete subjects arraylist.
        concreteSubject.register( this);
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

    @Override
    public void update(double obs) {


            double dragonsHealth = obs;
            if(dragonsHealth < 0) {
                characterHealth();
            }
            else {
                System.out.println("Your character is still alive");
            }
        }




    // The goal of this update method is to play music when dragon is entered as the name.

}
