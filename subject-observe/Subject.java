public class Subject {
    private Observe[] observers;
    private int index = 0;
    public Subject() {
        observers = new Observe[10];
        System.out.println(this.observers.length);
    }

    public void register(Observe observe) {
        observers[index++] = observe;
    }
    public void unregister(Observe observe) {
        
    }

    public void notifyer() {
        for (int i = 0; i < index; i++){
            // System.out.println(observers);
            observers[i].update();
        }
    }
}