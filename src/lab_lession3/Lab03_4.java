package lab_lession3;

import java.util.Arrays;

public class Lab03_4 {

    /*
     * While array 1 still has value && array 2 still has value
     *   If (array1 [index1] < array2 [index2])
     *    mergedarray [mergedindex] = array1 [index1]
     *    index1 ++
     *   else
     *    mergedarray [mergedindex] = array2 [index2]
     *    index2 ++
     *   mergedindex ++
     *
     * While array1 [index1] < array1.length
     *  put all remaining value into merged array
     * While array1 [index2] < array2.length
     *  put all remaining value into merged array
     *
     *
     * */
    public static void main(String[] args) {

        int[] array1 = {1, 12, 16, 28, 34};
        int[] array2 = {1, 13, 16, 27, 99};
        int array1len = array1.length;
        int array2len = array2.length;
        int mergedlen = array1len + array2len;
        int[] mergedArray = new int[mergedlen];

        int index1 = 0;
        int index2 = 0;
        int mergedIndex = 0;

/*        while(index1< array1len && index2 < array2len){
            if (array1[index1] < array2[index2]) {
                mergedArray[mergedIndex] = array1[index1];
                index1 ++;
                mergedIndex ++;
            } else {
                mergedArray[mergedIndex] = array2[index2];
                index2++;
                mergedIndex++;
            }
        }*/

        while (index1 < array1len && index2 < array2len) {
            if (array1[index1] < array2[index2]) {
                mergedArray[mergedIndex++] = array1[index1++];
            } else {
                mergedArray[mergedIndex++] = array2[index2++];
            }
        }

        while (index1 < array1len) {
            mergedArray[mergedIndex++] = array1[index1++];
        }
        while (index2 < array2len) {
            mergedArray[mergedIndex++] = array2[index2++];
        }

        System.out.println(Arrays.toString(mergedArray));

    }
}
