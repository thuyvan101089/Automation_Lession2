package lab_lesson7_2;

import java.util.Arrays;

public class TestRacingAnimal {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        Animal winner = RacingController.getWinnerAnimal(Arrays.asList(horse,dog,tiger));
        System.out.println("The winner is" + " " + winner.getName());
        System.out.println("with speed" + " "+  winner.getSpeed());
    }
}
