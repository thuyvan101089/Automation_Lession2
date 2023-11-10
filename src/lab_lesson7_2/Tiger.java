package lab_lesson7_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    final static int MAXSPEED_TIGER = 100;
    final static int randomSpeed_Tiger = new SecureRandom().nextInt(MAXSPEED_TIGER);

    public Tiger() {
    super("Strong Tiger",randomSpeed_Tiger);

    }
}
