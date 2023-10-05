package lession04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    /*
    * Allow user to have 3 guesses from 0 -9
    * If matches number = Hooray
    * Else Good luck
    *
    * */
    public static void main(String[] args) {

        int guessingTime =0;
        final int MAX_TIME = 3;
        int randoomNumber = new SecureRandom().nextInt(10);
        do {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Please input your number");
            int inputUserNumber = scanner.nextInt();

            if (inputUserNumber == randoomNumber){
                System.out.println("Hooray! You win");
                break;
            }
            guessingTime ++;

        }while (guessingTime < MAX_TIME );

        if(guessingTime == MAX_TIME){
            System.out.println("Good Luck in next time!!!");
        }


    }
}
