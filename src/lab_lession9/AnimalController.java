package lab_lession9;

import lab_lession7_2_bestpractice.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public static List<AnimalWithBuilder> filterAnimal(List<AnimalWithBuilder> animalList) {

        List<AnimalWithBuilder> filteredAnimalList = new ArrayList<>();

        for (AnimalWithBuilder animals : animalList) {
            if (!animals.isWithWings()) {
                filteredAnimalList.add(animals);
            } else {
                System.out.println(animals.getName() + " with wings can not join the race");
            }
        }
        return filteredAnimalList;
    }

    public static AnimalWithBuilder getWinner(List<AnimalWithBuilder> filteredAnimalList) {

        AnimalWithBuilder winner = filteredAnimalList.get(0);
        for (AnimalWithBuilder animal : filteredAnimalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
