package lesson04;

import java.security.SecureRandom;
import java.util.Scanner;

public class FunctionLearning {
    public static void main(String[] args) {
        /*
         * ==== GAME MENU ====
         * 1. Generate random number
         * 0. Exit
         * */
        boolean isContinuing = true;
        while (isContinuing){
            printGameMenu();
            int inputOption = getInputOption();
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
    // access modifier (Public) + Class method?(static - optional) + return type (void: no return value) + function name + (parameter - optional) {function body)
    // A set of instructions to do a task
    // Start with a task - camelCase
    // Function name: meaningful, express the closet what it does
    // single responsibility
    public static void printGameMenu() {
        System.out.println("==== GAME MENU ====");
        System.out.println("1. Generate random number");
        System.out.println("0. Exit");
    }
    public static int getInputOption() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please select an option");
        return scanner.nextInt();
    }


}

