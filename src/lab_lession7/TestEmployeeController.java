package lab_lession7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployeeController {
    public static void main(String[] args) {
        Employee employee1 = new FTE();
        Employee employee2 = new FTE();
        Employee employee3 = new FTE();

        Employee employee4 = new Contractor();
        Employee employee5 = new Contractor();

        int totalSalary = EmployeeController.getTotalSalary(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        System.out.println(totalSalary);

    }
}
