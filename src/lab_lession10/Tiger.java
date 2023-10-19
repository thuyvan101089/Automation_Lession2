package lab_lession10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private final static int MAXSPEED_TIGER = 100;
    private final static int RANDOM_SPEED_TIGER = new SecureRandom().nextInt(MAXSPEED_TIGER);

    @Override
    public String getName() {
        return this.name = "Super Tiger";
    }

    @Override
    public int getSpeed() {
        return this.speed = RANDOM_SPEED_TIGER;
    }
}
