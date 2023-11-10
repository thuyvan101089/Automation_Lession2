package lesson_12_strategy_design_pattern;

public class Duck {

    //Attribute : behaviors / Quack (implements) QuackBehavior (Interface)
    protected QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.Quack();
    }
    protected void setQuackBehavior (QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
