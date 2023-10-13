package lession5;

import java.util.*;

public class ArrayListDuplicatedValue {
    public static void main(String[] args) {
        List<Integer> oldListWithDuplicatedValue = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //Convert the odd to even number
        for (int index = 0; index < oldListWithDuplicatedValue.size(); index++) {
            int targetNumber = oldListWithDuplicatedValue.get(index);
            boolean isOddNumber = targetNumber % 2 != 0;
            if (isOddNumber) {
                oldListWithDuplicatedValue.set(index, targetNumber * 2);
            }
        }
        System.out.println(oldListWithDuplicatedValue);
        // Removed duplicated
        // loop over elements in old list
        // if (value from old list is NOT in the new list){
        //     put the element in new list
/*
        List<Integer> newListValue = new ArrayList<>();
        for (int value : oldListWithDuplicatedValue) {
            if (!newListValue.contains(Integer.valueOf(value))) {
                newListValue.add(value);
            }

        }
        for (Integer newValue : newListValue) {
            System.out.println(newValue);
        }
*/
        Set <Integer> set = new HashSet<>(oldListWithDuplicatedValue);
        List<Integer> newListValue = new ArrayList<>(set);
        System.out.println(newListValue);

        //Get first 3 minimum

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,1,5, 2, 3, 4, 5));
        //output: 1,2,3
        Set<Integer> setNumber = new HashSet<>(myList);
        System.out.println(setNumber);
        List<Integer> convertedList = new ArrayList<>(setNumber);
        List<Integer> first3value = convertedList.subList(0,3);
        System.out.println(first3value);
    }
}
