package lab_lession7_2_bestpractice;

import java.security.SecureRandom;

public class Dog extends Animal{
    final static int MAXSPEED_DOG = 60;
    final static int RANDOMSPEED_DOG = new SecureRandom().nextInt(MAXSPEED_DOG);
    public Dog() {
        this.name = "Strong Dog";
        this.speed = RANDOMSPEED_DOG;
    }
}
