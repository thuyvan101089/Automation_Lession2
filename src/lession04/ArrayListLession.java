package lession04;

import java.util.List;

public class ArrayListLession {
    public static void main(String[] args) {
        //Declare
        List <Integer> myList = new java.util.ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // Lay length
        myList.size();
        myList.isEmpty();

        // Loop
        for (Integer value : myList) {
            System.out.println(value);
        }
        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }
        // Co chua gia tri trong List hay khong tra True false
        System.out.println("Before remove" + myList.contains(5));
        System.out.println(myList.contains(10));
        // Tra ve index of value, neu khong co vi tri trong mang index = -1
        System.out.println(myList.indexOf(10));
        System.out.println(myList.indexOf(5));
        //remove
        myList.remove (Integer.valueOf(5));
        System.out.println("After remove" + myList.contains(5));
        //Update
        myList.set(0,10);
        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

    }
}
