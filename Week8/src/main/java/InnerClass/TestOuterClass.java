package InnerClass;

public class TestOuterClass {
    public static void main (String[] args){
        // Instantiate OuterClass
        OuterClass outerClass = new OuterClass();

        // Instantiate the InnerClass
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Show that InnerClass can access variables in OuterClass
        System.out.println(outerClass.a); //10
        innerClass.innerPrintA(); //10

        // Show that InnerClass stores a reference to OuterClass
        OuterClass bb = innerClass.giveBackOuter();

        // All objects have an equals method that tells you if another variable is the same instance
        System.out.println(bb.equals(outerClass));
    }
}