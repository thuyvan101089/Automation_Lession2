package lab_lesson7_2_bestpractice;

import java.security.SecureRandom;

public class Tiger extends Animal{
    final static int MAXSPEED_TIGER = 100;
    final static int RANDOMSPEED_TIGER = new SecureRandom().nextInt(MAXSPEED_TIGER);
    public Tiger() {
        this.name = "Strong Tiger";
        this.speed = RANDOMSPEED_TIGER;
    }
}
