package case_study_module2.services;

import case_study_module2.models.Customer;
import case_study_module2.models.Employee;
import case_study_module2.models.Person;
import case_study_module2.utils.AgeProblem;
import case_study_module2.utils.CheckingPatternDate;
import javafx.scene.input.DataFormat;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    
    public static final String pathFileCustom = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\Customer.CSV";
    public static List<Customer> customerList = new ArrayList<>();
    static {
        try {
            CustomerServiceImpl.readFileCustom();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public static void readFileCustom() throws FileNotFoundException {
        FileReader fileReader = new FileReader(pathFileCustom);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Customer customer;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    String fullName = temp[0];
                    String dateOfBirth = temp[1];
                    boolean gender = temp[2].equals("Nam");
                    long identityCardNum = Long.parseLong(temp[3]);
                    long phoneNumber = Long.parseLong(temp[4]);
                    String mail = temp[5];
                    String customID = temp[6];
                    String customType = temp[7];
                    String address = temp[8];
                    customer = new Customer(fullName,dateOfBirth,gender,identityCardNum,phoneNumber,
                            mail,customID,customType,address);
                    customerList.add(customer);
                }
            } catch (IOException e) {
                System.out.println("Lỗi nhập xuất");
            }
    }
    public static void writeFileCustomer() throws IOException {
        FileWriter fileWriter = new FileWriter(pathFileCustom);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customerList) {
            bufferedWriter.write(customer.getFullName()+","+customer.getDateOfBirth()+","+
                    (customer.isGender() ? "Nam":"Nữ")+","+
                    customer.getIdentityCardNum()+","+customer.getPhoneNumber()
                    + ","+ customer.getMail()+","+customer.getCustomID()
                    +","+ customer.getCustomType()+","+customer.getAddress());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    @Override
    public void showCustomers() throws FileNotFoundException {
        System.out.println("\nDanh sách khách hàng : ");
        for (Customer customer :customerList) {
            System.out.println(customerList.indexOf(customer)+""+customer);
        }
    }

    @Override
    public void addNewCustomers() {
        System.out.println("Thêm mới khách hàng : ");
        Scanner scanner = new Scanner(System.in);
        String fullName,dateOfBirth, mail, customID,customType, address;
        String gender;
        long idCard,phoneNum;
        System.out.print("Nhập vào tên : ");
        fullName = scanner.nextLine();
        System.out.print("Nhập vào ngày tháng năm sinh : ");
        dateOfBirth = CheckingPatternDate.checkDate(dateOfBirth = scanner.nextLine());
        dateOfBirth = AgeProblem.checkAge(dateOfBirth);
        System.out.print("Nhập vào e-mail : ");
        mail = scanner.nextLine();
        System.out.print("Nhập vào giới tính : ");
        gender = scanner.nextLine();
        System.out.print("Nhập vào custom ID : ");
        customID = scanner.nextLine();
        System.out.print("Nhập vào CMND : ");
        idCard = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập vào số điện thoại : ");
        phoneNum = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập vào địa chỉ : ");
        address = scanner.nextLine();
        System.out.println("Nhập vào loại khách hàng : ");
        customType = scanner.nextLine();
        Customer customerNew = new Customer(fullName,dateOfBirth,gender.equals("Nam"),idCard,phoneNum,mail,customID,
                customType,address);
        customerList.add(customerNew);
        try {
            CustomerServiceImpl.writeFileCustomer();
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
    }

    @Override
    public void editCustomers() {
        System.out.println("Chỉnh sửa khách hàng \n");
        System.out.print("Nhập vào id khách hàng để sửa thông tin : ");
        Scanner scanner = new Scanner(System.in);
        String fullName,dateOfBirth, mail, customID,customType, address;
        boolean gender;
        long idCard,phoneNum;
        customID = scanner.nextLine();
        System.out.print("Chỉnh sửa tên : ");
        fullName = scanner.nextLine();
        System.out.print("Chỉnh sửa ngày tháng năm sinh : ");
        dateOfBirth = CheckingPatternDate.checkDate(dateOfBirth = scanner.nextLine());
        dateOfBirth = AgeProblem.checkAge(dateOfBirth);
        System.out.print("Chỉnh sửa e-mail : ");
        mail = scanner.nextLine();
        System.out.print("Chỉnh sửa giới tính : ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Chỉnh sửa CMND : ");
        idCard = Long.parseLong(scanner.nextLine());
        System.out.print("Chỉnh sửa số điện thoại : ");
        phoneNum = Long.parseLong(scanner.nextLine());
        System.out.print("Chỉnh sửa địa chỉ : ");
        address = scanner.nextLine();
        System.out.println("Chỉnh sửa loại khách hàng : ");
        customType = scanner.nextLine();
        Customer customerNew = new Customer(fullName,dateOfBirth,gender,idCard,phoneNum,mail,customID,customType,
                address);
        int index = 0;
        for (Customer customer : customerList) {
            if (customer.getCustomID().equals(customID)) {
                index = customerList.indexOf(customer);
            }
        }
        customerList.add(index,customerNew);
        customerList.remove(index+1);
    }
}
