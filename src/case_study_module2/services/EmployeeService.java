package case_study_module2.services;

import case_study_module2.models.Employee;

public interface EmployeeService extends Service{
    void addNewEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void showEmployees();
    Employee getEmployee(int index);

}
