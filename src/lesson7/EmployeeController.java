package lesson7;

import java.util.List;

public class EmployeeController {
    //Functional programming
    public static int totalSalary(List<Employee> employeeList){

        if (employeeList == null || employeeList.isEmpty()){
            throw new IllegalArgumentException("Employee List can not be null");
        }
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() ;
        }
        return totalSalary;

    }
}
