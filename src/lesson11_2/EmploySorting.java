package lesson11_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmploySorting {
    public static void main(String[] args) {
        Employee teo = new Employee("teo", 10);
        Employee ti = new Employee("ati", 27);
        Employee tun = new Employee("tun", 11);

        List<Employee> employees =Arrays.asList(teo,ti,tun);
        System.out.println("Before Sorting");
        System.out.println(employees);


        System.out.println("After Sorting");
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println("After Sorting | NAME");
        employees.sort(new EmployeeNameComparator());
        System.out.println(employees);

    }
}
