package Adapter;

public class ChristmasTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("I'm on the table");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly, I'm dead");
    }
}
