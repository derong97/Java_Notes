package StaticFactoryMethod;

public class TestTea {
    public static void main(String[] args) {
        Tea tea = Tea.teh();
        System.out.println(tea.toString());
    }
}
