# Problem
+ Duck: MollardDuck, BabyDuck, Decoy
+ Quack: Quack, squeak, mute
+ Fly: FlywithWing, flyNoway
+ => design Controller: Fly, quack

/*
abstract class Duck(){
protected abstract void quack();
protected abstract void fly();
}

public class MallarDuck extends Duck{

Override
public void quack(){
sout ("Quack! Quack")
}
}
Controller:
void performQuack(Duck duck){
duck.quack():
}
Test/Usage:
Duck babyDuck = new BabyDuck();
performQuack (babyDuck)





*/
# Add new requirement:
Duck Type is able to change the behavior at run time (fly/quack) 