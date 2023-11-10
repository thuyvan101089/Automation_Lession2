package lesson6;

import utils.ArrayListHelper;

import java.util.Arrays;
import java.util.List;

public class TestArrayListHelper {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5);
        int minValue = ArrayListHelper.findMinValue(myList);
        int maxValue = ArrayListHelper.findMaxValue(myList);

    }
}
