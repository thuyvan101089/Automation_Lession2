package lession7;

import java.util.List;

public class EmployeeController {
    //Functional programming
    public static int totalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() ;
        }
        return totalSalary;

    }
}
