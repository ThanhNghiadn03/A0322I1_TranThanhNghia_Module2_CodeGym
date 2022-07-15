package case_study_module2.services;

import case_study_module2.models.Facility;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService{
    public static House house = new House("Rent house",180,130,3,
            "months","normal",5);
    public static Villa villa = new Villa("Rent villa", 300 , 10000,13,
            "weeks","Big",13.6,3);
    public static Room room = new Room("Rent Room",15,500,3,
            "days","free wifi");
    public static LinkedHashMap<Object, Integer> facilityList = new LinkedHashMap<Object,Integer>();

    @Override
    public void displayFacility() {
        FacilityServiceImpl.updateStatusOfFacility();
        Set<Object> keys = facilityList.keySet();
        for (Object key : keys) {
            System.out.println(key + " ____ "+facilityList.get(key));
        }
    }

    public static void updateStatusOfFacility() {
        facilityList.put(house,0);
        facilityList.put(villa,0);
        facilityList.put(room,0);
    }
    public static void updateStatusVilla() {
        Set<Object> keys = facilityList.keySet();
        for (Object key : keys) {
            if (key.equals(villa)) {
                facilityList.put(key,facilityList.get(key)+1);
            }
        }
    }
}
