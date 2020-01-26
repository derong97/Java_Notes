package Strategy;

public interface QuackBehaviour {
    void quack();
}

class LoudQuack implements QuackBehaviour{
    @Override
    public void quack(){
        System.out.println("QUACKKKKK");
    }
}

class SoftQuack implements QuackBehaviour{
    @Override
    public void quack(){
        System.out.println("...quack...");

    }
}
