package lab_lession3;

import java.util.Arrays;

public class Lab03_3 {
    /* Sort an integer array from min to max
     * Input: {12, 34, 1, 16, 28}
     * Expected output: {1, 12, 16, 28, 34}
     * Lay so dau tien (i=0) so voi so thu 2 (i=1)
     * Neu so dau > so sau => doi vi tri lay so thu 2 len
     * Neu so dau < so sau => tiep tuc di lay so thu 2 (i=1) so voi so thu 3(i=2)
     * Neu so thu 2 > so thu 3
     * => doi vi tri 2 va 3 + Quay nguoc ve so sanh so thu 1 va so thu 2
     * Nguoc lai so thu 2 < so thu 3 => tiep tuc lay so thu 3 so voi thu 4
     * */
    public static void main(String[] args) {
        int[] intArray = new int[]{12, 34, 1, 16, 28};

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println("A sorted array from min to max:" + Arrays.toString(intArray));

    }
}
