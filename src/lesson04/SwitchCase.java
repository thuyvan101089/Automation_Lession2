package lesson04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input your number");
        int userInputNumber = scanner.nextInt();

        switch (userInputNumber){
            case 1:
                System.out.println("Giai Nhat");
                break;
            case 2:
                System.out.println("Giai Nhi");
                break;
            case 3:
                System.out.println("Giai Ba");
                break;
            default:
                System.out.println("Chuc may man");

        }
    }
}
