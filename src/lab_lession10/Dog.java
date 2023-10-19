package lab_lession10;

import java.security.SecureRandom;

public class Dog extends Animal {
    private final static int MAXSPEED_DOG = 60;
    private final static int RANDOM_SPEED_DOG = new SecureRandom().nextInt(MAXSPEED_DOG);

    @Override
    public String getName() {
        return this.name = "Super Dog";
    }

    @Override
    public int getSpeed() {
        return this.speed = RANDOM_SPEED_DOG;
    }

}
