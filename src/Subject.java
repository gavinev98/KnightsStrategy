
public interface Subject {
    //Register observer
    public void register(Observer o);
    // Unregister observer
    public void unregister(Observer o);
    // Notfiy observers
    public void notifyObserver();
}
