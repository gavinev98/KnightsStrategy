

public class GameSoundObserver implements Observer{

    //creating boolean variable to play sound.
    private boolean isSoundPlaying = false;



    //Access to this to be able to use different methods using dependency injection. we need to have this to register objects in here.
    private Subject concreteSubject;


    // creating constructor using dependency injection and registering the GameSound Observer.
    public GameSoundObserver(Subject concreteSubject)
    {
        this.concreteSubject = concreteSubject;

        // add to concrete subjects arraylist.
        concreteSubject.register(this);
    }


    public void playMusic()
    {
        System.out.println("Play introduction music // observer fired");


        isSoundPlaying = true;
}




    @Override
    public void update(String name) {

        if(name.equals("Dragon"))
        {
            playMusic();
        }

    }
}
