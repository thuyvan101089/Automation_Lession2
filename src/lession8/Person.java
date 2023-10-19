package lession8;

public class Person {

    private String name;
    private int age;
    // Validate gia tri dau vao de dam bao data cho object
    public Person(String name, int age) {
        if (age < 0){
            throw new IllegalArgumentException("The age is invalid. Age can not be less than 0");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
