package case_study_module2.services;

import case_study_module2.models.Booking;
import case_study_module2.models.Customer;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionServiceImpl implements PromotionService{
    public static Stack<Booking> bookingStackVoucher = new Stack<>();
    @Override
    public void displayCustomerFollowYear() {
        System.out.print("Nhập vào năm : ");
        Scanner scanner = new Scanner(System.in);
        int year;
        year = Integer.parseInt(scanner.nextLine());
        System.out.println("Danh sách khách hàng sử dụng dịch vụ trong năm "+year+" : ");
        Set<Booking> keyBookings = BookingServiceImpl.bookingTreeMap.keySet();
        for (Booking keyBooking : keyBookings) {
            if (keyBooking.getStartDay().getYear() == year) {
                for (Customer customer : CustomerServiceImpl.customerList) {
                    if (customer.getCustomID().equals(keyBooking.getCustomID())) {
                        System.out.println(customer);
                    }
                }
            }
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        System.out.print("Nhập vào năm khuyến mãi : ");
        int tenPercent,twentyPercent,fiftyPercent,year;
        Scanner scanner = new Scanner(System.in);
        year = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số lượng voucher 10% : ");
        tenPercent = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số lượng voucher 20% : ");
        twentyPercent = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số lượng voucher 50% : ");
        fiftyPercent = Integer.parseInt(scanner.nextLine());
        Set<Booking> keyBookings = BookingServiceImpl.bookingTreeMap.keySet();
        for (Booking keyBooking : keyBookings) {
            if (keyBooking.getStartDay().getYear() == year) {
                for (Customer customer : CustomerServiceImpl.customerList) {
                    if (customer.getCustomID().equals(keyBooking.getCustomID())) {
                        bookingStackVoucher.push(keyBooking);
                    }
                }
            }
        }
        System.out.println("Những khách hàng nhận được voucher 10% trong năm "+year+" là : ");
        displayVoucher(tenPercent);
        System.out.println("Những khách hàng nhận được voucher 20% trong năm "+year+" là : ");
        displayVoucher(twentyPercent);
        System.out.println("Những khách hàng nhận được voucher 50% trong năm "+year+" là : ");
        displayVoucher(fiftyPercent);
    }

    public static void displayVoucher(int typeVoucher) {
        for (int i=0 ; i<typeVoucher ; i++) {
            Booking checkVoucher = bookingStackVoucher.pop();
            for (Customer customer : CustomerServiceImpl.customerList) {
                if (customer.getCustomID().equals(checkVoucher.getCustomID())) {
                    System.out.println(customer);
                }
                if (bookingStackVoucher.isEmpty()) {
                    break;
                }
            }
        }
    }
}
