public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void dispaly() {
        System.out.println("I am a really mallard duck");
    }
}