package Builder;

public class TeaTwo {
    private boolean sugar;
    private boolean milk;
    private boolean ice;
    private boolean toGo;

    private TeaTwo(TeaBuilder teaBuilder){
        this.sugar = teaBuilder.sugar; // TeaBuilder is a member of the outerclass TeaTwo
        this.milk = teaBuilder.milk; // has the rights to access private attributes
        this.ice = teaBuilder.ice;
        this.toGo = teaBuilder.toGo;
        System.out.println("" + sugar + milk + ice + toGo);
    }

    static class TeaBuilder {
        private boolean sugar;
        private boolean milk;
        private boolean ice;
        private boolean toGo;

        TeaBuilder(){}

        public TeaBuilder setSugar ( boolean sugar){
            this.sugar = sugar;
            return this;
        }

        public TeaBuilder setMilk ( boolean milk){
            this.milk = milk;
            return this;
        }

        public TeaBuilder setIce ( boolean ice){
            this.ice = ice;
            return this;
        }

        public TeaBuilder setToGo ( boolean toGo){
            this.toGo = toGo;
            return this;
        }

        public TeaTwo build (){
            return new TeaTwo( this );
        }
    }
}