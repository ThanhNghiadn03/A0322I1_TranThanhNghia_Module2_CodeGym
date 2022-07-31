package case_study_module2.services;

import java.io.IOException;

public interface BookingService extends Service{
    void addNewBooking() throws IOException;
    void displayListBooking();
}
