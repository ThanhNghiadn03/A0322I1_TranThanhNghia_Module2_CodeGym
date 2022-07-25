package case_study_module2.controllers;

import case_study_module2.services.*;

import java.util.Scanner;

public class FuramaController {
    public static void employeeManagement() {
        System.out.println("\n EMPLOYEE MANAGEMENT :\n");
        System.out.println("1. Display list employees.");
        System.out.println("2. Add new employee.");
        System.out.println("3. Edit employee.");
        System.out.println("4. Return main menu.");
        System.out.print("\nChoose 1 of functions : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        EmployeeService employeeManagement = new EmployeeServiceImpl();
        switch (choose) {
            case 1 :
                employeeManagement.showEmployees();
                FuramaController.employeeManagement();
                break;
            case 2 :
                employeeManagement.addNewEmployee();
                FuramaController.employeeManagement();
                break;
            case 3 :
                employeeManagement.editEmployeeByID();
                FuramaController.employeeManagement();
                break;
            case 4 :
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice !!!");
                break;
        }
    }

    public static void customerManagement() {
        System.out.println("\nCUSTOMER MANAGEMENT :\n");
        System.out.println("1. Display list customers.");
        System.out.println("2. Add new customer.");
        System.out.println("3. Edit customer.");
        System.out.println("4. Return main menu.");
        System.out.print("\nChoose 1 of functions : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        CustomerService customerManagement = new CustomerServiceImpl();
        switch (choose) {
            case 1 :
                customerManagement.showCustomers();
                FuramaController.customerManagement();
                break;
            case 2 :
                customerManagement.addNewCustomers();
                FuramaController.customerManagement();
                break;
            case 3 :
                customerManagement.editCustomers();
                FuramaController.customerManagement();
                break;
            case 4 :
                FuramaController.displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice !!!");
                break;
        }
    }
    public static void facilityManagement() {
        System.out.println("\nFACILITY MANAGEMENT : ");
        System.out.println("1. Display list facility.");
        System.out.println("2. Add new facility.");
        System.out.println("3. Display list facility maintenance.");
        System.out.println("4. Return main menu.");
        System.out.print("\nChoose 1 of functions : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        FacilityService facilityService = new FacilityServiceImpl();
        switch (choose) {
            case 1 :
                facilityService.displayFacility();
                FuramaController.facilityManagement();
                break;
            case 2 :
                facilityService.addNewFacility();
                FuramaController.facilityManagement();
                break;
        }
    }

    public static void displayMainMenu() {
        System.out.println("\nMAIN MENU\n");
        System.out.println("1. Employee Management.");
        System.out.println("2. Customer Management.");
        System.out.println("3. Facility Management.");
        System.out.println("4. Booking Management.");
        System.out.println("5. Promotion Management.");
        System.out.println("6. Exit");
        System.out.print("\nChoose 1 of functions : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        switch (choose) {
            case 1 :
                employeeManagement();
                break;
            case 2 :
                customerManagement();
                break;
            case 3 :
                facilityManagement();
                break;
            case 4 :
                System.out.println("1. Add new booking.");
                System.out.println("2. Display list booking.");
                System.out.println("3. Create new contracts.");
                System.out.println("4. Display list contracts.");
                System.out.println("5. Edit contracts.");
                System.out.println("6. Return main menu.");
                break;
            case 5 :
                System.out.println("1. Display list customers use service.");
                System.out.println("2. Display list customers get voucher.");
                System.out.println("3. Return main menu.");
                break;
            case 6 :
                break;
            default:
                System.out.println("Invalid choice !!!");
                break;
        }
    }

    public static void main(String[] args) {
        FuramaController.displayMainMenu();
    }
}
