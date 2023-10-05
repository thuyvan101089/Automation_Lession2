package lession03;

public class BreakCase {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 1, 3,4, 5};
        boolean hasEvenNumber = false;

        for (int number : myArray) {
            if (number % 2 == 0){
                hasEvenNumber = true;
                System.out.printf("So chan %d",number);
                break;
            }
        }
        if (!hasEvenNumber){
            System.out.println("Khong co so chan");
        }
    }
}
