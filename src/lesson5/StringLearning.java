package lesson5;

public class StringLearning {
    public static void main(String[] args) {
        //Regular expression | Regex
        String cookingTimeStr = "105 minutes";
        String cookingTimeNumberStr = cookingTimeStr.replaceAll("[^0-9]", "");
        String cookingTimeChar = cookingTimeStr.replaceAll("[^a-z]", " ");
        //Ep kieu tu String sang Integer
        int cookingTimeNumber = Integer.parseInt(cookingTimeNumberStr);

        System.out.println(cookingTimeNumberStr);
        System.out.println(cookingTimeChar);

    }
}
