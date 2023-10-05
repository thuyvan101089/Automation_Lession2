package lession03;

public class FlowControlKeyWord {
    public static void main(String[] args) {

        // break : khi gap thi thoat khoi vong lap

       int[] myArray = {1, 2, 3, 4, 5};

        for (int value : myArray) {
            if (value == 3) {
                break;
            } else {
                System.out.println(value);
            }
        }
        /*
        * Khi thoa dieu kien = 3 => continue thuc hien vong lap
        *
        * */
        int[] myArray2 = {1, 2, 3, 4, 5};

        for (int value2 : myArray2) {
            if (value2 == 3) {
                continue;
            } else {
                System.out.println(value2);
            }
        }
    }
}
