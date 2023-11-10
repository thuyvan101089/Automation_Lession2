package lesson11_2;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator <Employee> {
    @Override
    public int compare(Employee thisEmployee, Employee thatEmployee) {
        return thisEmployee.getName().compareToIgnoreCase(thatEmployee.getName());
    }
}
