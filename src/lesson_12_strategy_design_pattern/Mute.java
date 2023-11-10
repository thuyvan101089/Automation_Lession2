package lesson_12_strategy_design_pattern;

public class Mute implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("I'm mute");
    }
}
