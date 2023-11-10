package lesson_12_strategy_design_pattern;

public class BabyDuck extends Duck{


    public BabyDuck() {
        quackBehavior = new Squeak();
    }
}
