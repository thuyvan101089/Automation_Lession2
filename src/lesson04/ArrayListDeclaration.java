package lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclaration {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        myList.add(6);

        for (int value : myList) {
            System.out.println(value);

        }

    }
}
