package lab_lesson2;

import java.util.Scanner;

public class Lab02_1 {
    public static void main(String[] args) {
    /*  Get input from user about height(m) and weight(kg) then calculate BMI

        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
        BMI = weight / (height x height)

    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight (kg)");
        float inputUserWeight = scanner.nextFloat();

        System.out.println("Please input your height (m)");
        float inputUserHeight = scanner.nextFloat();

        if (inputUserWeight > 0 && inputUserHeight > 0) {
            float bmiIndex = inputUserWeight / (inputUserHeight * inputUserHeight);

            if (bmiIndex < 18.5) {
                System.out.println("You are underweight < 18.5");

            } else if (bmiIndex <= 24.9) {
                System.out.println("You are normal weight: 18.5 – 24.9");

            } else if (bmiIndex <= 29.9) {
                System.out.println("You are overweight: 25–29.9");
            } else {
                System.out.println("You are obesity = BMI of 30 or greater");
            }

        } else {
            System.out.println("Please input valid your height/weight");
        }


    }


}
