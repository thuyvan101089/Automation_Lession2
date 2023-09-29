package lab_lession3;

import java.util.Arrays;

public class Lab03_3 {
    /* Sort an integer array from min to max
    * Input: {12, 34, 1, 16, 28}
    * Expected output: {1, 12, 16, 28, 34}
    * */
    public static void main(String[] args) {
        int [] intArray = new int[] {12, 34, 1, 16, 28 };

        for (int i = 0; i < intArray.length -1; i++) {
            if (intArray [i] > intArray [i+1]) {
                int temp = intArray[i];
                intArray[i] = intArray[i+1];
                intArray[i+1] = temp;
                i = -1;
            }
        }
        System.out.println("A sorted array from min to max:" + Arrays.toString(intArray));

    }
}
