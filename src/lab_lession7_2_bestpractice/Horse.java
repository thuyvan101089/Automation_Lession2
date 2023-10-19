package lab_lession7_2_bestpractice;

import java.security.SecureRandom;

public class Horse extends Animal{
    final static int MAXSPEED_HORSE = 75;
    final static int RANDOMSPEED_HORSE = new SecureRandom().nextInt(MAXSPEED_HORSE);
    public Horse() {
        this.name = "Strong Tiger";
        this.speed =  RANDOMSPEED_HORSE;
    }
}
