package lab_lession6;

import java.util.Scanner;

public class Lab06_2 {
    /*
     *
     * String myPassword = "password123";
     * Allow user to input maximum 3 times
     * */
    public static void main(String[] args) {

        final int MAXINPUTTIME = 3;
        int inputTime = 0;
        String myPassword = "password123";

        do {

            String inputPassword = getInputPassWord();

            if (inputPassword.equals(myPassword)) {
                System.out.println("Your password are correct!");
                break;
            }else {
                System.out.println("Your password are incorrect!");
            }
            inputTime++;

        } while (inputTime < MAXINPUTTIME);
        if (inputTime == MAXINPUTTIME) {
            System.out.println("You have reached login attempt limit ");
        }

    }

    public static String getInputPassWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your password");
        return scanner.nextLine();
    }


}
