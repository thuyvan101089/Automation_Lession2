package lesson_12_strategy_design_pattern;

public class Squeak implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("Squeak! Squeak!");
    }
}
