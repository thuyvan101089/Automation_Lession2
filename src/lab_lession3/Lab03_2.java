package lab_lession3;

public class Lab03_2 {
    /*
    *Finding maximum value/minimum value from an integer array
    * int[] intArr = {1, 2, 3, 4, 5};
    * Minimum: 1
    * Maximum: 5
    * */
    public static void main(String[] args) {
        int [] intArr = new int[] {1, 2, 3, 4, 5};
        int minNumber = intArr[0];
        int maxNumber = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minNumber){
                minNumber = intArr[i];
            }
            if (intArr[i] > maxNumber){
                maxNumber = intArr[i];
            }
        }
        System.out.printf("Minimum number %d\n",minNumber);
        System.out.printf("Maximun number %d",maxNumber);


    }
}
