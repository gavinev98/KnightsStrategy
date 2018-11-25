



import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;


import java.io.FileInputStream;


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


    public static void characterHealth(String filepath)
    {
        System.out.println("Your Character has died");

        try
        {
            AudioData data = new AudioStream(new FileInputStream(filepath)).getData();
            ContinuousAudioDataStream sound = new ContinuousAudioDataStream(data);
            AudioPlayer.player.start(sound);


        }
        catch(Exception e)
        {
            System.out.println("Error Playing Music");
        }

    }

    @Override
    public void update(double obs) {


            double charHealth = obs;
            if(charHealth <= 0) {
                characterHealth("C:/Users/Gavin Everett/Desktop/KnightsStrategy/src/pacman_death.wav");
            }
            else {
                System.out.println("Your character is still alive");
            }
        }




    // The goal of this update method is to play music when dragon is dead.

}
