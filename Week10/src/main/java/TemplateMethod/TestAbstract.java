package TemplateMethod;

public class TestAbstract {
    public static void main(String[] args) {
        Feline taro = new Tiger("Tiger", "Sumatran Tiger");
        makeSound(taro);
    }

    static void makeSound(Feline feline){
        feline.sound();
    }
}

abstract class Feline{

    private String name;
    private String breed;

    public Feline(String name, String breed){
        this.breed = breed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void sound();
}

class Tiger extends Feline{
    Tiger(String name, String breed){
        super(name, breed);
    }
    @Override
    public void sound(){
        System.out.println("yeah, tigress!");
    }
}

