package lession5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListD5 {
    public static void main(String[] args) {
        List<Integer> myIntArr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //Covert all numbers in the list into even number
        //Change odd => even number ( odd *2, odd +-1)
        //Loop all numbers in list
        // if (odd number){
        //  int newValue = myIntArr.get(index) * 2;
        // Set the new value

        for (int index = 0; index < myIntArr.size(); index++) {
            int targetNumber = myIntArr.get(index);
            boolean isOddNumber = targetNumber %2 !=0;
            if (isOddNumber){
                myIntArr.set(index,targetNumber * 2);
            }

        }

        //Functional Interface / Predicate => Lambada Expression
        // myIntArr.removeIf(value -> (value ==2 || value ==4));
        myIntArr.removeAll(List.of(2));

        for (Integer value : myIntArr) {
            System.out.println(value);
        }
    }
}
