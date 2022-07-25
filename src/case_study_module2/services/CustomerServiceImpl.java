package case_study_module2.services;

import case_study_module2.models.Customer;
import case_study_module2.models.Employee;
import case_study_module2.models.Person;
import javafx.scene.input.DataFormat;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    public static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Lê Trúc Nhân", "1985-12-16",true,333333,
                8425983,"trucnhan@gmail.com","custom01"
        ,"Gold","61 Đống Đa , Hà Nội"));
        customerList.add(new Customer("Trần Đắc Văn","04/08/1975",
                true,444444,8466678,"van@gmail.com","custom02",
                "Silver","84 Liên Chiểu , Đà Nẵng"));
    }

    @Override
    public void showCustomers() {
        System.out.println("\nDanh sách khách hàng : ");
        for (Customer customer :customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNewCustomers() {
        System.out.println("Thêm mới khách hàng : ");
        Scanner scanner = new Scanner(System.in);
        String fullName,dateOfBirth, mail, customID,customType, address;
        boolean gender;
        long idCard,phoneNum;
        System.out.print("Nhập vào tên : ");
        fullName = scanner.nextLine();
        System.out.print("Nhập vào ngày tháng năm sinh : ");
        dateOfBirth = scanner.nextLine();
        try {
            LocalDate birthday = LocalDate.parse(dateOfBirth, Person.dateTimeFormatter);
        }catch (DateTimeParseException dt) {

        }
        System.out.print("Nhập vào e-mail : ");
        mail = scanner.nextLine();
        System.out.print("Nhập vào giới tính : ");
        gender = Boolean.parseBoolean(scanner.nextLine());
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
        Customer customerNew = new Customer(fullName,dateOfBirth,gender,idCard,phoneNum,mail,customID,
                customType,address);
        customerList.add(customerNew);
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
        dateOfBirth = scanner.nextLine();
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
