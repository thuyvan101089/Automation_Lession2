package lab_lesson7_2_bestpractice;

import java.util.Arrays;

public class TestRacingAnimalController {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal horse = new Horse();

        Animal winner = RacingAnimalController.getWinner(Arrays.asList(tiger,dog,horse));
        System.out.println("The winner is: " + winner.getName());
        System.out.println("With speed "+ winner.getSpeed());

    }
}
