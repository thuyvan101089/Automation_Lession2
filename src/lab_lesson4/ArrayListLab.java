package lab_lesson4;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLab {
    /*
     * Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
     * After that, have a menu (You can use while loop) to have below options
     * =====MENU======
     * 1. Print all numbers
     * 2. Print maximum value
     * 3. Print minimum value
     * 4. Search number
     * We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index.
     * Otherwise, print that number is not in the list
     * */
    public static void main(String[] args) {
        final int ARRAYLISTSIZE = 5;
        final int MAXIMUMNUMBER = 1000;

        List<Integer> myList = new ArrayList<>();
        for (int index = 0; index < ARRAYLISTSIZE; index++) {
            int randomNumber = new SecureRandom().nextInt(MAXIMUMNUMBER);
            myList.add(randomNumber);
        }
        boolean isContinuing = true;
        while (isContinuing) {
            //In menu game
            printGameMenu();
            // Get User input Option
            System.out.println("Please select an option");
            int inputOption = getUserInputOption();
            // Xu ly lua chon
            switch (inputOption) {
                case 1:
                    // Goi ham in all numbers
                    printAllValue(myList);
                    break;
                case 2:
                    // Goi ham maximum number
                    int maxNumber = getMaxNumber(myList);
                    System.out.println("Max Value: " + maxNumber);
                    break;
                case 3:
                    // Goi ham min number
                    int minNumber = getMinNumber(myList);
                    System.out.println("Min Value:" + minNumber);
                    break;
                case 4:
                    // Get input from user
                    System.out.println("Please input your number:");
                    int inputNumber = getUserInputOption();
                    // Search
                    searchInputNumber(inputNumber, myList);
                    break;
                case 0:
                    isContinuing = false;
                    System.out.println("Good Bye!!");
                    break;
                default:
                    System.out.println("Your option is not correct. Please select your option again");
            }
        }
    }

    public static void printGameMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("0. Exit");
    }

    public static int getUserInputOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printAllValue(List<Integer> myList) {
        for (int value : myList) {
            System.out.print(value + " \n");
        }
    }

    public static int getMaxNumber(List<Integer> myList) {
        int maxNumber = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) > maxNumber) {
                maxNumber = myList.get(index);
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(List<Integer> myList) {
        int minNumber = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) < minNumber) {
                minNumber = myList.get(index);
            }
        }
        return minNumber;
    }

    public static void searchInputNumber(int inputNumber, List<Integer> myList) {
        boolean existingNumber = myList.contains(inputNumber);
        if (existingNumber) {
            System.out.println(inputNumber + " " + "exists in the array list");
            int indexOfInputNumber = myList.indexOf(inputNumber);
            System.out.println("The index of number is " + indexOfInputNumber);
        } else {
            System.out.println("Your number does not exist in the array list");
        }
    }
}
