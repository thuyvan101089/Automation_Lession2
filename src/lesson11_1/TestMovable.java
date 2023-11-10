package lesson11_1;

import java.util.Arrays;

public class TestMovable {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Human human = new Human();
        Tree tree= new Tree();

        RacingController.initFirstMove(Arrays.asList(animal,human));
    }
}
