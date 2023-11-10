package lesson12;

public interface InterfaceWithDefaultMethod {

    default void doSth(){
        System.out.println("Hello");
    }
}
