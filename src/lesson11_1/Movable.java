package lesson11_1;

import java.security.SecureRandom;

public interface Movable {
    void move();

    default void intTheMove(){
        System.out.println("Moving...");
    }
    static int returnRandomInt(){
        return new SecureRandom().nextInt(Integer.MIN_VALUE);

    }

}
