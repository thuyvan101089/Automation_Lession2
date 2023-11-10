package lesson11_1;

import java.util.List;

public class RacingController {
    public static void initFirstMove(List<Movable> movableList){
        for (Movable movableObjects : movableList) {
            movableObjects.move();

        }
    }
}
