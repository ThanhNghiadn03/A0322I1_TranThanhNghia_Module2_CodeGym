package case_study_module2.services;

import case_study_module2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    public static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("Tran Thanh Nghia","21/06/2003",true,
                111111,847936,"Nghia@gmail.com","emp00",
                "university", "manager",12000));
        employeeList.add(new Employee("Ha Nhu Y","13/09/2007",false,
                222222,845678,"Y@gmail.com",
                "emp01","University","receptionist", 6000));
    }

    @Override
    public void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        String fullName,dateOfBirth,mail,empID,acdemicLevel,position;
        boolean gender;
        long idCard,phoneNum,salary;
        System.out.print("Nhập vào tên : ");
        fullName = scanner.nextLine();
        System.out.print("Nhập vào ngày tháng năm sinh : ");
        dateOfBirth = scanner.nextLine();
        System.out.print("Nhập vào e-mail : ");
        mail = scanner.nextLine();
        System.out.print("Nhập vào trình độ học vấn : ");
        acdemicLevel = scanner.nextLine();
        System.out.print("Nhập vào vị trí : ");
        position = scanner.nextLine();
        System.out.print("Nhập vào giới tính : ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhập vào employee ID : ");
        empID = scanner.nextLine();
        System.out.print("Nhập vào CMND : ");
        idCard = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập vào số điện thoại : ");
        phoneNum = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập vào lương : ");
        salary = Long.parseLong(scanner.nextLine());
        Employee employee = new Employee(fullName,dateOfBirth,gender,idCard,phoneNum,mail,empID,acdemicLevel,
                position,salary);
        employeeList.add(employee);
    }

    @Override
    public void showEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void editEmployeeByID() {
        System.out.print("Nhập vào id nhân viên để chỉnh sửa thông tin : ");
        Scanner scanner = new Scanner(System.in);
        String emplID,fullName,dateOfBirth,acdemicLevel,mail,position;
        boolean gender;
        long idCard,phoneNum,salary;
        emplID = scanner.nextLine();
        System.out.print("Chỉnh sửa tên : ");
        fullName = scanner.nextLine();
        System.out.print("Chỉnh sửa ngày tháng năm sinh : ");
        dateOfBirth = scanner.nextLine();
        System.out.print("Chỉnh sửa e-mail : ");
        mail = scanner.nextLine();
        System.out.print("Chỉnh sửa trình độ học vấn : ");
        acdemicLevel = scanner.nextLine();
        System.out.print("Chỉnh sửa vị trí : ");
        position = scanner.nextLine();
        System.out.print("Chỉnh sửa giới tính : ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Chỉnh sửa CMND : ");
        idCard = Long.parseLong(scanner.nextLine());
        System.out.print("Chỉnh sửa số điện thoại : ");
        phoneNum = Long.parseLong(scanner.nextLine());
        System.out.print("Chỉnh sửa lương : ");
        salary = Long.parseLong(scanner.nextLine());
        int index = 0;
        Employee employeeEdit = new Employee(fullName,dateOfBirth,gender,idCard,phoneNum,mail,emplID,acdemicLevel,
                position,salary);
        for (Employee employee : employeeList) {
            if (employee.getEmpID().equals(emplID)) {
                index = employeeList.indexOf(employee);
            }
            }
        employeeList.add(index,employeeEdit);
        employeeList.remove(index+1);
        }

    }