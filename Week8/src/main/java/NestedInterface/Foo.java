package NestedInterface;

public class Foo {

    interface Bar { // must be static
        void drink ();
    }

    Foo(){
    }

    void thirsty (Bar bar){
        bar.drink();
    }
}