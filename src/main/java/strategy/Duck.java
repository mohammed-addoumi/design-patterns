package strategy;

public abstract class Duck {

    FlyableBehavior flyableBehavior;

    Duck(FlyableBehavior flyableBehavior){
        this.flyableBehavior = flyableBehavior;
    }

    void fly(){
        flyableBehavior.fly();
    }

    void quack(){
        System.out.println("quacking");
    }
    void squack(){
        System.out.println("squacking");
    }
    abstract void display();
}

class MallarDuck extends Duck {
    MallarDuck(FlyableBehavior flyableBehavior){
        super(flyableBehavior);
    }
    @Override
    void display() {
        System.out.println("MallarDuck display");
    }
}

class RedHeadDuck extends Duck {
    RedHeadDuck(FlyableBehavior flyableBehavior){
        super(flyableBehavior);
    }
    @Override
    void display() {
        System.out.println("RedHeadDuck display");
    }
}


class Main{
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck(new FlyingFlyableBehavior());
        RedHeadDuck redHeadDuck = new RedHeadDuck(new NotFlyingFlyableBehavior());
        mallarDuck.quack();
        mallarDuck.display();
        mallarDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.display();
        redHeadDuck.fly();
    }
}