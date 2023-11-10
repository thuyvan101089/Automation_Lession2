package lab_lesson7_2;

import java.security.SecureRandom;

public class Horse extends Animal{
     final static int MAXSPEED_HORSE = 75;
     final static int randomSpeed_Horse = new SecureRandom().nextInt(MAXSPEED_HORSE);
    public Horse() {
    super("Strong Horse",randomSpeed_Horse);
    }
}
