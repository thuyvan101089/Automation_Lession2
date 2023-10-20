package lab_lession9;

public class AnimalWithBuilder {
    private String name = "Dog";
    private int speed = 60;
    private boolean withWings = false;

    protected AnimalWithBuilder(Builder build) {
        this.name = build.name;
        this.speed = build.speed;
        this.withWings = build.withWings;

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return withWings;
    }

    //Inner CLass
    public static class Builder {
        private String name = "Dog";
        private int speed = 60;
        private boolean withWings = false;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;

        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}
