package lession7;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        //Data from Object ||OOP
        //Controller to process data || Functional Programming
        Employee fte = new FTE();
        Employee contractor = new Contractor();
        int totalSalary = EmployeeController.totalSalary(Arrays.asList(fte,contractor));

        System.out.printf("Total Salary %d", totalSalary);

    }
}
