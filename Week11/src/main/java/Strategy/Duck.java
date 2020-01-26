package Strategy;

public class Duck {

    QuackBehaviour quackBehaviour;
    String name;

    Duck(String name){
        this.name = name;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    void quack(){
        quackBehaviour.quack();
    }
}
