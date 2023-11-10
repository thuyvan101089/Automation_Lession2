package lesson9_1;

import java.util.List;

public class EmployeeController {

    public static int getTotalSalary(List<Employee> employeeList){
        int totalSalary =0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
