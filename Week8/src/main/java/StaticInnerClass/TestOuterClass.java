package StaticInnerClass;

import java.io.IOException;

public class TestOuterClass {
    public static void main(String[] args) {
        // Instantiate the inner class
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        // System.out.println(OuterClass.a);
        innerClass.innerPrintA();
    }
}
