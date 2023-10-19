package lab_lession10;

import java.security.SecureRandom;

public class Horse extends Animal {
    private final static int MAXSPEED_HORSE = 75;
    private final static int RANDOM_SPEED_HORSE = new SecureRandom().nextInt(MAXSPEED_HORSE);

    @Override
    public String getName() {
        return this.name = "Super Horse";
    }

    @Override
    public int getSpeed() {
        return this.speed = RANDOM_SPEED_HORSE;
    }
}
