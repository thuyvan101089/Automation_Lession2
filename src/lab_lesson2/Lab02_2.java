package lab_lesson2;

import java.util.Scanner;

public class Lab02_2 {
    // Allow user to input a number, print out it’s an odd or even number
    /*
    1. Allow user to input an integer number
    2. Identify that the number is odd or even
    If the number % 2 = 0 {
    print that this number is even
    } else{
    print that the number is odd}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer number:");
        int userInputNumber = scanner.nextInt();
        if (userInputNumber % 2 == 0) {
            System.out.printf("%d is the even number", userInputNumber);
        } else {
            System.out.printf("%d is the odd number", userInputNumber);
        }

    }
}
