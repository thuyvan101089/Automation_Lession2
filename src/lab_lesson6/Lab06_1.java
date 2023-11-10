package lab_lesson6;

public class Lab06_1 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";

        int hourNumber = getHourNumber(inputString);
        int minNumber = getMinNumber(inputString);
        int totalMinutes = getTotalMinutes(hourNumber, minNumber);
        System.out.println(totalMinutes);

    }

    public static int getHourNumber(String inputString) {
        String hourString = inputString.substring(0, inputString.indexOf("hrs"));
        return Integer.parseInt(hourString);
    }

    public static int getMinNumber(String inputString) {
        String minString = inputString.substring(inputString.indexOf("d") + 2, inputString.indexOf("minutes") - 1);
        return Integer.parseInt(minString);
    }

    public static int getTotalMinutes(int hourNumber, int minNumber) {
        return (hourNumber * 60) + (minNumber);
    }


}
