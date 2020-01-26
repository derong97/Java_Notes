package Builder;

public class TestTeaTwo {
    public static void main(String[] args) {
        TeaTwo.TeaBuilder teaBuilder = new TeaTwo.TeaBuilder();

        /*
        teaBuilder = teaBuilder.setIce(true);
        teaBuilder = teaBuilder.setMilk(true);
        */

        teaBuilder = teaBuilder.setIce(true).setMilk(true); // same thing as commented
        // can eliminate the assignment statement i.e. teaBuilder.setIce(true).setMilk(true);

        TeaTwo teaTwo = teaBuilder.build();
        System.out.println(teaTwo);
    }
}
