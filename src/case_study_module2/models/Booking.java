package case_study_module2.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking implements Comparable<Booking> {
    private String bookingID;
    private LocalDate startDay;
    private LocalDate endDay;
    private String customID;
    private String nameOfService;
    private String serviceID;
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Booking(String bookingID, String startDay, String endDay, String customID, String nameOfService,
                   String serviceID) {
        this.bookingID = bookingID;
        this.startDay = LocalDate.parse(startDay, dateTimeFormatter);
        this.endDay = LocalDate.parse(endDay, dateTimeFormatter);
        this.customID = customID;
        this.nameOfService = nameOfService;
        this.serviceID = serviceID;
    }

    public Booking() {
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = LocalDate.parse(startDay, dateTimeFormatter);
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = LocalDate.parse(endDay, dateTimeFormatter);
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "Booking ID : " + bookingID + ", start day : " + startDay +
                ", end day : " + endDay +
                ", custom ID : " + customID +
                ", name of service : " + nameOfService +
                ", serviceID : " + serviceID  + "\n";
    }

    @Override
    public int compareTo(Booking o) {
        if (this.startDay.isEqual(o.startDay)) {
            if (this.endDay.isEqual(o.endDay)) {
                return 0;
            } else if (this.endDay.isBefore(o.endDay)) {
                return 1;
            } else {
                return -1;
            }
        }else if (this.startDay.isBefore(o.startDay)) {
            return 1;
        } else {
            return -1;
        }
    }
}
