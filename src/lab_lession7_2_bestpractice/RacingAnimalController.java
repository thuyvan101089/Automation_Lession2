package lab_lession7_2_bestpractice;

import java.util.List;

public class RacingAnimalController {
    public static Animal getWinner(List <Animal> animalList){

        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if(animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }
}
