package lab_lession3;

import java.util.Arrays;

public class Lab03_3_bublesort {

    /*
     * Sau khi thuc hien lap lan dau tien so lon nhat duoc di chuyen ve cuoi
     * Innerloop = 0 den unsortedIndex
     * Outloop = 1 den lenghth -1
     * */
    public static void main(String[] args) {
        int[] intArrray = {12, 34, 1, 16, 28};
        int arrayLen = intArrray.length;

        for (int unsortedIndex = intArrray.length - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int innerIndex = 0; innerIndex < unsortedIndex; innerIndex++) {
                if (intArrray[innerIndex] > intArrray[innerIndex + 1]) {
                    int temp = intArrray[innerIndex];
                    intArrray[innerIndex] = intArrray[innerIndex + 1];
                    intArrray[innerIndex + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(intArrray));
    }
}
