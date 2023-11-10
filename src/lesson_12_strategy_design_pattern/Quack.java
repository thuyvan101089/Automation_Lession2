package lesson_12_strategy_design_pattern;

public class Quack implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("Quack Quack");
    }
}
