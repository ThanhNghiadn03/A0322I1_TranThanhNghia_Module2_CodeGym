package case_study_module2.services;

import case_study_module2.models.Facility;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService{
    public static House house = new House("HO01","House 1",180,130,
            3,
            "months","normal",5);
    public static Villa villa = new Villa("VL01","Villa 1", 300 , 10000,
            13,
            "weeks","Big",13.6,3);
    public static Room room = new Room("RO01","Room 1",15,500,3,
            "days","free wifi");
    public static LinkedHashMap<Object, Integer> facilityList = new LinkedHashMap<Object,Integer>();

    static {
        facilityList.put(house,0);
        facilityList.put(villa,0);
        facilityList.put(room,0);
    }

    @Override
    public void displayFacility() {
        Set<Object> keys = facilityList.keySet();
        for (Object key : keys) {
            System.out.println("\n"+key + " ____ "+facilityList.get(key));
        }
    }

    @Override
    public void addNewFacility() {
        Facility newFacility;
        System.out.println("\n1. Add new house.");
        System.out.println("2. Add new room.");
        System.out.println("3. Add new villa.");
        int choose;
        System.out.print("Enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        choose = Integer.parseInt(scanner.nextLine());
        String serviceID,nameOfService,typeRent,roomStandard,freeService;
        double areaUsed, rentalCost,areaPool;
        int maxNumOfCustomer, numOfFloors;
        switch (choose) {
            case 1 :
                System.out.printf("Service ID : ");
                serviceID = scanner.nextLine();
                System.out.printf("Name of service : ");
                nameOfService = scanner.nextLine();
                System.out.printf("Area : ");
                areaUsed = Double.parseDouble(scanner.nextLine());
                System.out.printf("Rental cost : ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                System.out.printf("Maximum number of customer : ");
                maxNumOfCustomer = Integer.parseInt(scanner.nextLine());
                System.out.printf("Type rent : ");
                typeRent = scanner.nextLine();
                System.out.printf("Room standard : ");
                roomStandard = scanner.nextLine();
                System.out.printf("Number of floors : ");
                numOfFloors = Integer.parseInt(scanner.nextLine());
                newFacility = new House(serviceID,nameOfService,areaUsed,rentalCost,maxNumOfCustomer,
                        typeRent,roomStandard,numOfFloors);
                facilityList.put(newFacility,0);
                break;
            case 2 :
                System.out.printf("Service ID : ");
                serviceID = scanner.nextLine();
                System.out.printf("Name of service : ");
                nameOfService = scanner.nextLine();
                System.out.printf("Area : ");
                areaUsed = Double.parseDouble(scanner.nextLine());
                System.out.printf("Rental cost : ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                System.out.printf("Maximum number of customer : ");
                maxNumOfCustomer = Integer.parseInt(scanner.nextLine());
                System.out.printf("Type rent : ");
                typeRent = scanner.nextLine();
                System.out.printf("Free service : ");
                freeService = scanner.nextLine();
                newFacility = new Room(serviceID,nameOfService,areaUsed,rentalCost,maxNumOfCustomer,typeRent,
                        freeService);
                facilityList.put(newFacility,0);
                break;
            case 3 :
                System.out.printf("Service ID : ");
                serviceID = scanner.nextLine();
                System.out.printf("Name of service : ");
                nameOfService = scanner.nextLine();
                System.out.printf("Area : ");
                areaUsed = Double.parseDouble(scanner.nextLine());
                System.out.printf("Rental cost : ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                System.out.printf("Maximum number of customer : ");
                maxNumOfCustomer = Integer.parseInt(scanner.nextLine());
                System.out.printf("Type rent : ");
                typeRent = scanner.nextLine();
                System.out.printf("Room standard : ");
                roomStandard = scanner.nextLine();
                System.out.printf("Number of floors : ");
                numOfFloors = Integer.parseInt(scanner.nextLine());
                System.out.printf("Area of the pool : ");
                areaPool = Double.parseDouble(scanner.nextLine());
                newFacility = new Villa(serviceID,nameOfService,areaUsed,rentalCost,maxNumOfCustomer,
                        typeRent,roomStandard,areaPool,numOfFloors);
                facilityList.put(newFacility,0);
                break;
            default:
                System.out.println("Invalid!!!");
        }
    }
//    public static void updateStatusVilla() {
//        Set<Object> keys = facilityList.keySet();
//        for (Object key : keys) {
//            if (key.equals(villa)) {
//                facilityList.put(key,facilityList.get(key)+1);
//            }
//        }
//    }
}
