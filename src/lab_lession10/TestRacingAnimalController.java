package lab_lession10;

import java.util.Arrays;

public class TestRacingAnimalController {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        Animal winner = RacingAnimalController.getWinner(Arrays.asList(dog, tiger, horse));
        System.out.println("The animal winner is: " + winner.getName());
        System.out.println("With the speed: " + winner.getSpeed());

    }


}
