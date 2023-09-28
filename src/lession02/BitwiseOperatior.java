package lession02;

public class BitwiseOperatior {
    public static void main(String[] args) {
        //if (false & true) => false
        if (getFirstNumber() !=0 & getSecondNumber() !=0){
            System.out.println("Caculating...");
        }
    }

    private static int getFirstNumber(){
        System.out.println("Calling FirstNumber");
        return 0;
    }
    private static int getSecondNumber(){
        System.out.println("Calling SecondNumber");
        return 2;
    }
}
