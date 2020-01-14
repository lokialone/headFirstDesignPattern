public class Test{
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.register(new CatObserve());
        subject.notifyer();
    }

}