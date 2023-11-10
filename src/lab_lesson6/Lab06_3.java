package lab_lesson6;

public class Lab06_3 {
    /*
     * String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345nabc678" -> "12345678"
     *
     * */
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        char[] charArr = myStr.toCharArray();
        String mynewString = "";

        for (char character : charArr) {
            if (Character.isDigit(character)) {
                mynewString += character;

            }
        }
        System.out.println(mynewString);
    }

}
