package Singleton;

public class SafeRoom {

    private volatile static SafeRoom uniqueInstance;

    //declared private so only singleton can instantiate this class.
    private SafeRoom() {
    }

    // getInstance method provides away to instantiate the class and also return instance of it.
    public static SafeRoom getInstance() {
        if (uniqueInstance == null) {
            synchronized (SafeRoom.class) {
                uniqueInstance = new SafeRoom();
            }


        }

        return uniqueInstance;
    }


}
