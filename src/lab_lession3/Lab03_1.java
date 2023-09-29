package lab_lession3;

public class Lab03_1 {
    /*
     * Count how many odd, even number(s) in an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Even numbers: 2
     * Odd numbers: 3
     * */
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        int evenNumber = 0;
        int oddNumber = 0;
        for (int number : intArr) {
            if (number % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.printf("Even Number %d\n", evenNumber);
        System.out.printf("Odd Number %d", oddNumber);

    }
}
