package strategy;

public class NotFlyingFlyableBehavior implements FlyableBehavior {
    @Override
    public void fly() {
        System.out.println("not flying");
    }
}
