package lesson11_1;

public class Animal implements Movable, Swimable{
    @Override
    public void move() {
        System.out.println("Animal moving style");
    }

    @Override
    public void swim() {
        System.out.println("Animal swimming style");
    }
}
