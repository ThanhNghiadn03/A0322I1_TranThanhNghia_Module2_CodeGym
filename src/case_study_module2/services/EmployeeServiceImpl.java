package case_study_module2.services;

import case_study_module2.models.Employee;
import case_study_module2.models.Person;
import case_study_module2.utils.AgeException;
import case_study_module2.utils.AgeProblem;
import case_study_module2.utils.CheckingPatternDate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    public static final String pathFileEmployee = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\Employee.CSV";
    public static List<Employee> employeeList = new ArrayList<>();
    static {
        try {
            EmployeeServiceImpl.readFileEmployee();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void readFileEmployee() throws FileNotFoundException {
        FileReader fileReader = new FileReader(pathFileEmployee);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Employee employee;
        try {
            while ((line = bufferedReader.readLine())!=null) {
                temp = line.split(",");
                String fullName = temp[0];
                String dateOfBirth = temp[1];
                boolean gender = temp[2].equals("Nam");
                long identityCardNum = Long.parseLong(temp[3]);
                long phoneNumber = Long.parseLong(temp[4]);
                String mail = temp[5];
                String empID = temp[6];
                String academicLevel = temp[7];
                String position = temp[8];
                long salary = Long.parseLong(temp[9]);
                employee = new Employee(fullName,dateOfBirth,gender,identityCardNum,phoneNumber,mail,empID,academicLevel,
                        position,salary);
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
    }

    public static void writeFileEmployee() throws IOException {
        FileWriter fileWriter = new FileWriter(pathFileEmployee);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee : employeeList) {
            bufferedWriter.write(employee.getFullName()+","+employee.getDateOfBirth()+","+
                            (employee.isGender() ? "Nam":"Nữ")+","+employee.getIdentityCardNum()+","+
                    employee.getPhoneNumber()+","+employee.getMail()+","+employee.getEmpID()+","+
                            employee.getAcademicLevel()+","+employee.getPosition()+","+employee.getSalary());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    @Override
    public void addNewEmployee() {
        System.out.println("\nThêm mới nhân viên :");
        Scanner scanner = new Scanner(System.in);
        String fullName,dateOfBirth,mail,empID,acdemicLevel,position;
        String gender;
        long idCard,phoneNum,salary;
        System.out.print("Nhập vào tên : ");
        fullName = scanner.nextLine();
        System.out.print("Nhập vào ngày tháng năm sinh : ");
        dateOfBirth = CheckingPatternDate.checkDate(dateOfBirth = scanner.nextLine());
        dateOfBirth = AgeProblem.checkAge(dateOfBirth);
        System.out.print("Nhập vào e-mail : ");
        mail = scanner.nextLine();
        System.out.print("Nhập vào trình độ học vấn : ");
        acdemicLevel = scanner.nextLine();
        System.out.print("Nhập vào vị trí : ");
        position = scanner.nextLine();
        System.out.print("Nhập vào giới tính : ");
        gender = scanner.nextLine();
        System.out.print("Nhập vào employee ID : ");
        empID = scanner.nextLine();
        System.out.print("Nhập vào CMND : ");
        idCard = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập vào số điện thoại : ");
        phoneNum = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập vào lương : ");
        salary = Long.parseLong(scanner.nextLine());
        Employee employee = new Employee(fullName,dateOfBirth,gender.equals("Nam"),idCard,phoneNum,mail,empID,acdemicLevel,
                position,salary);
        employeeList.add(employee);
        try {
            EmployeeServiceImpl.writeFileEmployee();
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
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
        dateOfBirth = CheckingPatternDate.checkDate(dateOfBirth = scanner.nextLine());
        dateOfBirth = AgeProblem.checkAge(dateOfBirth);
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