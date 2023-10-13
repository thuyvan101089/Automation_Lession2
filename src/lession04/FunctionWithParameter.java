package lession04;

import java.util.Arrays;

public class FunctionWithParameter {

    public static void main(String[] args) {

        int[] array1 = {1, 12, 16, 28, 34};
        int[] array2 = {1, 13, 16, 27, 99};

        //argument: gia tri that cung cap cho function
        int []mergedArray = merged2SortedArray(array1,array2);
        System.out.println(Arrays.toString(mergedArray));
}
        // parameters: tham so, alias khi define function
 public static int[] merged2SortedArray(int[] array1, int[] array2){
     int array1len = array1.length;
     int array2len = array2.length;
     int mergedlen = array1len + array2len;
     int[] mergedArray = new int[mergedlen];

     int index1 = 0;
     int index2 = 0;
     int mergedIndex = 0;

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
     return mergedArray;

    }
}
