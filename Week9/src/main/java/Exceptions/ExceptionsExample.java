package Exceptions;

public class ExceptionsExample {
    public static void main(String[] args) {
/*        try{
            quotientInt(5,0);
        }catch(ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("-----------");
            System.out.println(ex.getMessage());
        }*/
        try{
            checkValidString("-1");
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }
    static boolean checkValidString(String in){
        Double d = Double.valueOf(in);
        if(d < 0) throw new IllegalArgumentException("Negative value not allowed");
        return true;
    }
/*    public static int quotientInt(int a, int b){
        return a/b;
    }*/
}
