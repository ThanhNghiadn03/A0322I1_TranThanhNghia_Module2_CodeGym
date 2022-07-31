package case_study_module2.services;

import case_study_module2.models.*;
import case_study_module2.utils.CheckingPatternChoice;
import case_study_module2.utils.CheckingPatternDate;

import java.io.*;
import java.util.*;

public class BookingServiceImpl implements BookingService{
    public static Map<Booking,String> bookingTreeMap = new TreeMap<>();
    public static final String fileBooking = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\Booking.CSV";
    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader(fileBooking);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Booking booking;
        while ((line = bufferedReader.readLine())!=null) {
            temp = line.split(",");
            String bookingID = temp[0];
            String startDay = temp[1];
            String endDay = temp[2];
            String customID = temp[3];
            String nameOfService = temp[4];
            String serviceID = temp[5];
            booking = new Booking(bookingID,startDay,endDay,customID,nameOfService,serviceID);
            bookingTreeMap.put(booking,serviceID);
        }
    }
    public static void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(fileBooking);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Set<Booking> keys = bookingTreeMap.keySet();
        for (Booking key : keys) {
            bufferedWriter.write(key.getBookingID()+ ","+key.getStartDay()+","+key.getEndDay()
                    +","+key.getCustomID()+","+key.getNameOfService()+","+key.getServiceID());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    @Override
    public void addNewBooking() throws IOException {
        String bookingID = "";
        String startDay = "";
        String endDay = "";
        String customID = "";
        String nameOfService = "";
        String serviceID = "";
        System.out.println("Danh sách khách hàng : ");
        for (Customer customer : CustomerServiceImpl.customerList) {
            System.out.println(customer);
        }
        System.out.print("\n\nNhập vào mã khách hàng để booking : ");
        Scanner scanner = new Scanner(System.in);
        customID = scanner.nextLine();
        for (Customer customer : CustomerServiceImpl.customerList) {
            if (customer.getCustomID().equals(customID)) {
                System.out.printf("\nNhập vào mã booking : ");
                bookingID = scanner.nextLine();
                System.out.printf("Nhập vào ngày bắt đầu : ");
                startDay = CheckingPatternDate.checkDate(startDay = scanner.nextLine());
                System.out.printf("Nhập vào ngày kết thúc : ");
                endDay = CheckingPatternDate.checkDate(endDay =scanner.nextLine());
            }
        }
        System.out.println("\n\nDanh sách dịch vụ : ");
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.displayFacility();
        System.out.print("\nNhập vào mã dịch vụ : ");
        serviceID = scanner.nextLine();
        Set<Object> keys = FacilityServiceImpl.facilityList.keySet();
        for (Object key : keys) {
                if (key instanceof House && ((House) key).getServiceID().equals(serviceID)) {
                    nameOfService = ((House) key).getNameOfService();
                    FacilityServiceImpl.facilityList.put(key,FacilityServiceImpl.facilityList.get(key)+1);
                } else if (key instanceof Room && ((Room) key).getServiceID().equals(serviceID)) {
                    nameOfService = ((Room) key).getNameOfService();
                    FacilityServiceImpl.facilityList.put(key,FacilityServiceImpl.facilityList.get(key)+1);
                } else if (key instanceof Villa && ((Villa) key).getServiceID().equals(serviceID)) {
                    nameOfService = ((Villa) key).getNameOfService();
                    FacilityServiceImpl.facilityList.put(key,FacilityServiceImpl.facilityList.get(key)+1);
                }
        }
        Booking booking = new Booking(bookingID,startDay,endDay,customID,nameOfService,serviceID);
        bookingTreeMap.put(booking,serviceID);
        BookingServiceImpl.writeFile();
        System.out.println("Đã lưu lại booking , bạn có muốn tiếp tục booking không (Y/N) ? ");
        String choose;
        choose = CheckingPatternChoice.checkChoice(choose =scanner.nextLine());
        if (choose.equals("Y") || choose.equals("YES")) {
            addNewBooking();
        }
    }

    @Override
    public void displayListBooking() {
        Set<Booking> keys = bookingTreeMap.keySet();
        for (Booking key : keys) {
            System.out.println(key);
        }
    }
}
