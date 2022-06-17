package strategy;

public class FlyingFlyableBehavior implements FlyableBehavior {
    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
