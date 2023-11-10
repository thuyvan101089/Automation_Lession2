package lesson11_2;

public class Employee implements Comparable <Employee>{
    private String name;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

/*    // Sort tu nho den lon
    @Override
    public int compareTo(Employee thatEmployee) {
        return this.salary - thatEmployee.salary;

    }*/


    // Sort tu lon den nho
    @Override
    public int compareTo(Employee thatEmployee) {
        return thatEmployee.salary - this.salary;

    }

}
