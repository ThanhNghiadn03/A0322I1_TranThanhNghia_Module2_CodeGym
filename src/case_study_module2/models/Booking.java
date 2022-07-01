package case_study_module2.models;

public class Booking extends Customer{
    private String bookingID;
    private String startDay;
    private String endDay;

    public Booking(String bookingID, String startDay, String endDay) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
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

    public void booking(Customer customer) {

    }
}
