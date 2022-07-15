package case_study_module2.models;

public class Booking {
    private String bookingID;
    private String startDay;
    private String endDay;
    private String customID;
    private String nameOfService;
    private String typeOfService;

    public Booking(String bookingID, String startDay, String endDay, String customID, String nameOfService,
                   String typeOfService) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customID = customID;
        this.nameOfService = nameOfService;
        this.typeOfService = typeOfService;
    }

    public Booking() {
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
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

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }
}
