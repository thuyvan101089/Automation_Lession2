package lesson9_1;

public class Contractor extends Employee{
    @Override
    public int getSalary() {
        return 30000;
    }

    @Override
    public int getSupportSalary() {
        return 0;
    }
}
