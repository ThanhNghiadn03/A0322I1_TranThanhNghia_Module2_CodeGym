package case_study_module2.services;

import case_study_module2.models.Employee;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService{
    public static ArrayList<Employee> employeesList;
    static {
        employeesList = new ArrayList<>();
        employeesList.add(new Employee("Tran Thanh Nghia","21/06/2003",true,
                111111,847936,"Nghia@gmail.com","emp00", "university", "manager",12000));
        employeesList.add(new Employee("Ha Nhu Y","13/09/2007",false,222222,845678,"Y@gmail.com",
                "emp01","University","receptionist", 6000));
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeesList.remove(employee);
    }

    @Override
    public void showEmployees() {
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }

    @Override
    public Employee getEmployee(int index) {
        return employeesList.get(index);
    }
}
