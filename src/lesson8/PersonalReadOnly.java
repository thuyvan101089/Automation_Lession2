package lesson8;

public class PersonalReadOnly {
    private String name;
    private int age;

    public PersonalReadOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        PersonalReadOnly person1 = new PersonalReadOnly("Teo", 19);
        System.out.println(person1.getName());

    }
}
