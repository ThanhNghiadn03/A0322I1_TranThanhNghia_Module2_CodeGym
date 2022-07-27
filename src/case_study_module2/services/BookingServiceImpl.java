package case_study_module2.services;

import case_study_module2.models.Customer;

import java.util.*;

public class BookingServiceImpl implements BookingService{
    public static Queue<Customer> customerBooking = new LinkedList<>();
    public static Queue<Object> serviceBooking = new LinkedList<>();
    public static void bookingImplement() {
        System.out.println("Danh sách khách hàng : ");
        for (Customer customer : CustomerServiceImpl.customerList) {
            System.out.println(customer);
        }
        System.out.print("\n\n Nhập vào mã khách hàng để booking : ");
        String idCustomer;
        Scanner scanner = new Scanner(System.in);
        idCustomer = scanner.nextLine();
        for (Customer customer : CustomerServiceImpl.customerList) {
            if (customer.equals(idCustomer)) {
                customerBooking.add(customer);
            }
        }
        System.out.println("\n\nDanh sách dịch vụ : ");
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.displayFacility();
        System.out.println("\nNhập vào mã dịch vụ : ");
        String idService = scanner.nextLine();
        Set<Object> keys = FacilityServiceImpl.facilityList.keySet();
        for (Object key : keys) {
            if (key.equals(idService)) {
                serviceBooking.add(key);
                FacilityServiceImpl.facilityList.put(key,FacilityServiceImpl.facilityList.get(key)+1);
            }
        }
        System.out.println("\nCONFIRM : ");
        System.out.println("Khách hàng "+customerBooking.peek().getFullName()
        + " đã lựa chọn dịch vụ "+(serviceBooking.peek()));
    }
}
