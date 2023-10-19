package lession8;

public class TestEncapsulation {
    public static void main(String[] args) {
        Person person1=  new Person("teo",18);
        System.out.printf("My name is: %s and my age is %d ",person1.getName(),person1.getAge());

        Person person2=  new Person("teo 2",-18);
        System.out.printf("My name is: %s and my age is %d ",person2.getName(),person2.getAge());
    }
}
