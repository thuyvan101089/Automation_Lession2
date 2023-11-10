package lesson13;

public class Calculator {
    private static int divide(int a, int b){
        // Validate the input
       /* if (b == 0) {
            throw new IllegalArgumentException("The second number must be not zero");
        }*/
        // Handle exception in middle
        return a/b;
    }

    public static void main(String[] args) {
        int firstnumber = 4;
        int secondnumber = 0;
        int result = 0;
        try{
            result = Calculator.divide(firstnumber,secondnumber);
        }catch (ArithmeticException e){
            throw new RuntimeException("The second number can not be zero");

        }catch (Exception e){
            throw new RuntimeException("Unknow Exception");
        }finally {
            System.out.println("Bye");
        }
        System.out.println("Result:" + result);
    }
}
