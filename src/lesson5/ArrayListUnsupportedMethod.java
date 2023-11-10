package lesson5;

import java.util.Arrays;
import java.util.List;

public class ArrayListUnsupportedMethod {

    //Unsupported Method / Stack trace
    public static void main(String[] args) {
        List<Integer> myAsList = Arrays.asList(1,2,3,4,5);
        myAsList.add(7);
        for (Integer value : myAsList) {
            System.out.println(value);
        }

    }

}
