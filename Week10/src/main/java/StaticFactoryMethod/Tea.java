package StaticFactoryMethod;

public class Tea {
    private boolean sugar;
    private boolean milk;
    private boolean ice;
    private boolean toGo;

    // you have more combinations now
    // 1) write more constructors
    // 2) write more static factory methods
    // ==> you will write alot of them!!!

    // if you declare private
    // the static factory method is the only way to create an instance
    private Tea( boolean sugar, boolean milk){
        this.sugar = sugar;
        this.milk = milk;
    }
    public static Tea teh (){
        return new Tea( true , true );
    }
    public static Tea tehkosong (){
        return new Tea( false , true );
    }

    public String toString(){
        String out = "teh";
        if(!milk){
            out = out + "+o";
        }
        if(!sugar){
            out = out + "+kosong";
        }
        return out;
    }
}