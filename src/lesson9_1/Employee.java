package lesson9_1;

public abstract class Employee {
    protected String name;
    protected int salary;
    protected int supportSalary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstraction is a mechanism where we hide the detail implementation and delegate
    // The implementation to crete class
    // To strongly force "is a relationship
    public abstract int getSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract int getSupportSalary();

    public void setSupportSalary(int supportSalary) {
        this.supportSalary = supportSalary;
    }
}
