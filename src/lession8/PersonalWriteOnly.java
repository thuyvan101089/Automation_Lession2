package lession8;

public class PersonalWriteOnly {
    private String name;
    private int age;

    public PersonalWriteOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        PersonalWriteOnly person1 = new PersonalWriteOnly("Teo", 19);
        person1.setName("Teo 2");
        person1.setAge(20);

    }
}
