package lesson02;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input arrival time");
        int inputTime = scanner.nextInt();

        boolean isHeOnTime1 = inputTime == 7 ? true : false;


    }

}
