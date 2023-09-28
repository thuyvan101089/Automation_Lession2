package lab_lession2;

import java.util.Scanner;

public class Lab02_3 {
    public static void main(String[] args) {

    /*   Get input from user about height(m) and weight(kg) then calculate BMI

        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
        BMI = weight / (height x 2)
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight (kg)");
        float inputUserWeight = scanner.nextFloat();

        System.out.println("Please input your height (m)");
        float inputUserHeight = scanner.nextFloat();

        if (inputUserWeight > 0 && inputUserHeight > 0) {
            float bmiIndex = inputUserWeight / (inputUserHeight * 2);
            float minNormalWeight = 18.5f;
            float maxNormalWeight = 24.9f;
            float adjustIndex;
            if (bmiIndex < 18.5) {
                adjustIndex = minNormalWeight - bmiIndex;
                System.out.println("You are underweight < 18.5");
                System.out.printf("You should increase %f kg",adjustIndex);

            } else if (bmiIndex <= 24.9) {
                System.out.println("You are normal weight: 18.5 – 24.9");

            } else if (bmiIndex <= 29.9) {
                adjustIndex = bmiIndex - maxNormalWeight;
                System.out.println("You are overweight: 25–29.9");
                System.out.printf("You should decrease %f kg",adjustIndex);
            } else {
                adjustIndex = bmiIndex - maxNormalWeight;
                System.out.println("You are obesity = BMI of 30 or greater");
                System.out.printf("You should decrease %f kg",adjustIndex);
            }

        } else {
            System.out.println("Please input valid your height/weight");
        }

    }
}
