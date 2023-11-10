package lesson04;

import java.util.Scanner;

public class SwitchCaseWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input your number");
        int userInputNumber = scanner.nextInt();

        switch (userInputNumber){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays");
                break;
            case 7:
            case 8:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Input again");

        }
    }
}
