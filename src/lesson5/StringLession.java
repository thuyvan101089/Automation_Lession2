package lesson5;

import java.util.Arrays;

public class StringLession {
    public static void main(String[] args) {
        String cat = "Cat";
        String cat2 = new String("Cat 2");
        System.out.println(cat.equals("Cat"));
        System.out.println(cat2.equals("Cat 2"));

        String withNumberString = "ThuyVan 1010^@";

        char[] charArray = withNumberString.toCharArray();
        for (char character : charArray) {
            if(Character.isDigit(character)){
                System.out.println(character + " " + "is a number");
            }
            if (Character.isLetter(character)){
                System.out.println(character+ " " + "is a letter");
            }
            if (Character.isSpaceChar(character)){
                System.out.println("SPACE");
            }

        }
        //Immutable
        String badWordContainer = "    bad, very bad, so bad";
        String newWord = badWordContainer.replace("bad", "b**");
        System.out.println(newWord);
        System.out.println(badWordContainer.trim());
        System.out.println(badWordContainer);
        // Substring, Indexof, split
        String url ="https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(5));
        System.out.println(url.indexOf("s"));
        System.out.println(url.indexOf("a"));
        System.out.println(Arrays.toString(url.split("")));
        System.out.println(Arrays.toString(url.split("o")));

        //Concat
        System.out.println("Van".concat("is my name"));
        System.out.println("Van"+ " " + "is my name");
        // su dung () bao so khi co String
        for (int number = 0; number < 5; number++) {
            System.out.println("Number is " + (number + 1));
        }
    }
}

