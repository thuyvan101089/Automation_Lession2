package lab_lession7_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    final static int MAXSPEED_DOG = 60;
    final static int randomSpeed_Dog = new SecureRandom().nextInt(MAXSPEED_DOG);
    public Dog() {
        super("Strong Dog",randomSpeed_Dog);
    }
}
