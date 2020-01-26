package Strategy;

public class TestDuck {

    public static void main(String[] args) {
        Duck duck = new Duck("Donald Duck");
        QuackBehaviour loudQuack = new LoudQuack();
        QuackBehaviour softQuack = new SoftQuack();

        /* Duck class is Strategy design pattern
        * behavior is DELEGATED to other objects
        * */

        boolean isLoud = true;
        if(isLoud){
            duck.setQuackBehaviour(loudQuack);
        } else{
            duck.setQuackBehaviour(softQuack);
        }
        duck.quack();
    }
}
