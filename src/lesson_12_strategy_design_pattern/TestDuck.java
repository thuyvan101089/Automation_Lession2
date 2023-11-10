package lesson_12_strategy_design_pattern;

public class TestDuck {
    public static void main(String[] args) {
        Duck mallardDuck= new MallardDuck();
        Duck babyDuck= new BabyDuck();

        DuckController.performQuack(mallardDuck);
        DuckController.performQuack(babyDuck);

        babyDuck.setQuackBehavior(new Quack());
        DuckController.performQuack(babyDuck);

    }
}
