package lab_lession10;

public abstract class Animal {
    protected String name;
    protected int speed;

    public Animal() {
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSpeed();

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
