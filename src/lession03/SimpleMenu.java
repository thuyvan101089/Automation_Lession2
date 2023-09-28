package lession03;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        /*
        * ==== GAME MENU ====
        * 1. Generate random number
        * 0. Exit
        * */
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("==== GAME MENU ====");
            System.out.println("1. Generate random number");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner (System.in);
            System.out.println("Please select an option");
            int inputOption = scanner.nextInt();

            if (inputOption == 0 ){
                isContinuing = false;
            } else if (inputOption == 1) {
                System.out.printf("Your number is %d\n", new SecureRandom().nextInt(5));

            }else {
                System.out.println("Please input option again");
            }
        }
        System.out.println("Good Bye!!");
    }
}
