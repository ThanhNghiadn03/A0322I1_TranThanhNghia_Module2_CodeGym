package case_study_module2.utils;

import case_study_module2.models.Booking;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;
import case_study_module2.services.BookingServiceImpl;
import case_study_module2.services.FacilityServiceImpl;

import java.util.Set;

public class CheckingTimesUseFacility {
    public static void Times() {
        int timeOfHouse = 0;
        int timeOfRoom =0;
        int timeOfVilla = 0;
        Set<Booking> keys = BookingServiceImpl.bookingTreeMap.keySet();
        for (Booking key : keys) {
            Set<Object> objects = FacilityServiceImpl.facilityList.keySet();
            for (Object object : objects) {
                if (object instanceof House) {
                    if (key.getServiceID().equals(((House) object).getServiceID())) {
                        timeOfHouse++;
                        FacilityServiceImpl.facilityList.put(object,timeOfHouse);
                    }
                } else if (object instanceof Room) {
                    if (key.getServiceID().equals(((Room) object).getServiceID())) {
                        timeOfRoom++;
                        FacilityServiceImpl.facilityList.put(object,timeOfRoom);
                    }
                } else if (object instanceof Villa) {
                    if (key.getServiceID().equals(((Villa) object).getServiceID())) {
                        timeOfVilla++;
                        FacilityServiceImpl.facilityList.put(object,timeOfVilla);
                    }
                }
            }
        }
    }
}
