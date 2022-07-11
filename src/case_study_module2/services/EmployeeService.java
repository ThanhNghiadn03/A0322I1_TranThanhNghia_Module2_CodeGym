package case_study_module2.services;

import case_study_module2.models.Employee;

public interface EmployeeService extends Service{
    void addNewEmployee();
    void showEmployees();
    void editEmployeeByID();
}
