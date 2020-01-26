
public class Duck {

    String name;

    Duck(String name){
        this.name = name;
    }

    /* you have to change the implementation of quack()

    * (1) delete and rewrite the code
    * ==> BAD: you will break existing code (other people have already been using yours in a bigger team)
    *
    * (2) inherit the class and override quack()
    * ==> BAD: maintenance and testing nightmare
    * newDuck() ==> new NewDuck()
    * ==> BAD: inheritance does not make sense because subclass is the same as superclass with the same features (instead of more)
    */
    void quack(){
        System.out.println(name + " is quacking");
    }
}

class NewDuck extends Duck{
    NewDuck(String name){
        super(name);
    }

    @Override
    void quack(){
        System.out.println(name + " quacks loudly");
    }
}
