package lesson11_1;

public class Human implements Movable,Swimable{
    @Override
    public void move() {
        System.out.println("Human moving style");
    }

    @Override
    public void swim() {
        System.out.println("Human swimming style");
    }
}
