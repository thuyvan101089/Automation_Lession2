package utils;


public class ArrayHelper {
    public static int[] bubbleSortArray(int[] arrayToBeSorted) {

        for (int unsortedIndex = arrayToBeSorted.length - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int innerIndex = 0; innerIndex < unsortedIndex; innerIndex++) {
                if (arrayToBeSorted[innerIndex] > arrayToBeSorted[innerIndex + 1]) {
                    int temp = arrayToBeSorted[innerIndex];
                    arrayToBeSorted[innerIndex] = arrayToBeSorted[innerIndex + 1];
                    arrayToBeSorted[innerIndex + 1] = temp;
                }

            }
        }
        return arrayToBeSorted;

    }
}
