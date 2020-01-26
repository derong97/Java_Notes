package NestedInterface;

public class TestFoo {

    public static void main(String[] args) {
        Foo f = new Foo();
        f.thirsty(new C()); // method 1

        f.thirsty(new Foo.Bar(){ // method 2: Anonymous Inner Class (good for one-time use)
            @Override
            public void drink(){
                System.out.println("Anonymous Inner Class");
            }
        });
    }

    static class C implements Foo.Bar{
        @Override
        public void drink() {
            System.out.println("Gulp");
        }
    }
}
