package StaticInnerClass;

public class OuterClass {
    int b;

    static int a;
    OuterClass(){ a = 10 ; }

    void outerPrintA (){
        System.out.println(a);
    }

    // modify by declaring InnerClass static
    static class InnerClass {
        static int d;
        int c;
        InnerClass(){
            c = 100 ;
        }

        void innerPrintA (){
            System.out.println(a);
        }
    }
}