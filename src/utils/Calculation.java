package utils;

public class Calculation {
    public static int sum (int number1, int number2){
        return  number1 + number2;
    }
    public static int sum (int number1, int number2, int number3){
        return  number1 + number2 + number3;
    }
    // Rest Paramter/ Var argument => thuong dat o cuoi trong day parameter

    public  static int sum(int ...nums){
        int total = 0;
        for (int num : nums) {
            total += num;

        }
        return total;
    }

    /*
    * Method signature: name of method and parameter of method
    * Paramter of method: different data type OR different quantity
    * It happens: Compile Time
    * */
}
