package lession02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // < 18 | 18 - 55| > 55
        // khai bao constant variable + viet hoa, cach nhau bang _
        final int MINIMUM_AGE = 18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age");
        int userAge = scanner.nextInt();

        if (userAge < MINIMUM_AGE) {
            System.out.println("Do not sell");
            if (userAge <= 12) {
                System.out.println("Calling police");
            }
        } else if (userAge <= 55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("Can buy 2");

        }
    }
}

