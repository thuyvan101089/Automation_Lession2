package lab_lesson9;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import static lab_lesson9.AnimalWithBuilder.Builder;

public class AnimalBuilderTest {
    public static void main(String[] args) {

        final int MAXSPEED_HORSE = 75;
        final int MAXSPEED_TIGER = 100;
        final int MAXSPEED_DOG = 60;
        final int MAXSPEED_FALCON = 150;

        Builder builder = new Builder();

        AnimalWithBuilder horse = builder
                .setName("Strong Horse")
                .setSpeed(new SecureRandom().nextInt(MAXSPEED_HORSE))
                .setWithWings(false)
                .build();

        AnimalWithBuilder tiger = builder
                .setName("Strong Tiger")
                .setSpeed(new SecureRandom().nextInt(MAXSPEED_TIGER))
                .setWithWings(false)
                .build();

        AnimalWithBuilder dog = builder
                .setName("Strong Dog")
                .setSpeed(new SecureRandom().nextInt(MAXSPEED_DOG))
                .setWithWings(false)
                .build();

        AnimalWithBuilder falcon = builder
                .setName("Strong Falcon")
                .setSpeed(new SecureRandom().nextInt(MAXSPEED_FALCON))
                .setWithWings(true)
                .build();

        List<AnimalWithBuilder> filterList = AnimalController.filterAnimal(Arrays.asList(horse, tiger, dog, falcon));
        AnimalWithBuilder winner = AnimalController.getWinner(filterList);
        System.out.println("The winner animal is: " + winner.getName());
        System.out.println("With speed " + winner.getSpeed());

    }
}
