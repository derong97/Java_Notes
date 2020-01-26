package Adapter;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck says quack");
    }
}
