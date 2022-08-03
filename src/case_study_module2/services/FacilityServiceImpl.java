package case_study_module2.services;

import case_study_module2.models.Facility;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;
import case_study_module2.utils.CheckingTimesUseFacility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService{
    public static final String pathFileHouse = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\House.csv";
    public static final String pathFileVilla = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\Villa.CSV";
    public static final String pathFileRoom = "E:\\A0322I1_TranThanhNghia_Module2\\src\\case_study_module2\\data\\Room.CSV";
    public static LinkedHashMap<Object, Integer> facilityList = new LinkedHashMap<Object,Integer>();

    static {
        try {
            readFileOfFacility();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        CheckingTimesUseFacility.Times();
    }

    public static void readFileOfFacility() throws FileNotFoundException {
        FileReader readerHouse= new FileReader(pathFileHouse);
        FileReader readerRoom = new FileReader(pathFileRoom);
        FileReader readerVilla = new FileReader(pathFileVilla);
        BufferedReader[] bufferedReaders = new BufferedReader[3];
        bufferedReaders[0] = new BufferedReader(readerHouse);
        bufferedReaders[1] = new BufferedReader(readerVilla);
        bufferedReaders[2] = new BufferedReader(readerRoom);
        try {
            House house;
            String line;
            String tempOfHouse[];
            while ((line = bufferedReaders[0].readLine())!=null) {
                tempOfHouse = line.split(",");
                String serviceID = tempOfHouse[0];
                String nameOfService = tempOfHouse[1];
                double areaUsed = Double.parseDouble(tempOfHouse[2]);
                double rentalCost = Double.parseDouble(tempOfHouse[3]);
                int maxNumOfCustomer = Integer.parseInt(tempOfHouse[4]);
                String typeRent = tempOfHouse[5];
                String roomStandard = tempOfHouse[6];
                int numOfFloors = Integer.parseInt(tempOfHouse[7]);
                house = new House(serviceID,nameOfService,areaUsed,rentalCost,maxNumOfCustomer,typeRent,roomStandard,numOfFloors);
                facilityList.put(house,0);
            }
            Villa villa;
            line= "";
            String tempOfVilla[];
            while ((line = bufferedReaders[1].readLine())!= null) {
                tempOfVilla = line.split(",");
                String serviceID = tempOfVilla[0];
                String nameOfService = tempOfVilla[1];
                double areaUsed = Double.parseDouble(tempOfVilla[2]);
                double rentalCost = Double.parseDouble(tempOfVilla[3]);
                int maxNumOfCustomer = Integer.parseInt(tempOfVilla[4]);
                String typeRent = tempOfVilla[5];
                String roomStandard = tempOfVilla[6];
                double areaPool = Double.parseDouble(tempOfVilla[7]);
                int numOfFloors = Integer.parseInt(tempOfVilla[8]);
                villa = new Villa(serviceID,nameOfService,areaUsed,rentalCost,maxNumOfCustomer,typeRent,roomStandard,
                        areaPool,numOfFloors);
                facilityList.put(villa,0);
            }
            Room room;
            line = "";
            String tempOfRoom[];
            while ((line=bufferedReaders[2].readLine())!=null) {
                tempOfRoom = line.split(",");
                String serviceID = tempOfRoom[0];
                String nameOfService = tempOfRoom[1];
                double areaUsed = Double.parseDouble(tempOfRoom[2]);
                double rentalCost = Double.parseDouble(tempOfRoom[3]);
                int maxNumOfCustomer = Integer.parseInt(tempOfRoom[4]);
                String typeRent = tempOfRoom[5];
                String freeService = tempOfRoom[6];
                room = new Room(serviceID,nameOfService,areaUsed,rentalCost,maxNumOfCustomer,typeRent,freeService);
                facilityList.put(room,0);
            }
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất");
        }
    }

    public static void writeFileOfFacility() throws IOException {
        FileWriter writerHouse = new FileWriter(pathFileHouse);
        FileWriter writerVilla = new FileWriter(pathFileVilla);
        FileWriter writerRoom = new FileWriter(pathFileRoom);
        BufferedWriter[] bufferedWriters = new BufferedWriter[3];
        bufferedWriters[0] = new BufferedWriter(writerHouse);
        bufferedWriters[1] = new BufferedWriter(writerVilla);
        bufferedWriters[2] = new BufferedWriter(writerRoom);
        Set<Object> keys = facilityList.keySet();
        for (Object key : keys) {
            if (key instanceof House) {
                bufferedWriters[0].write(((House) key).getServiceID()+","+((House) key).getNameOfService()+","+
                        ((House) key).getAreaUsed()+","+((House) key).getRentalCost()+","+
                        ((House) key).getMaxNumOfCustomer()+","+((House) key).getTypeRent()+","+
                        ((House) key).getRoomStandard()+","+((House) key).getNumOfFloors());
                bufferedWriters[0].newLine();
                bufferedWriters[0].close();
            } else if (key instanceof Villa) {
                bufferedWriters[1].write(((Villa) key).getServiceID()+","+((Villa) key).getNameOfService()
                        +","+((Villa) key).getAreaUsed()+","+((Villa) key).getRentalCost()+","+
                        ((Villa) key).getMaxNumOfCustomer()+","+((Villa) key).getTypeRent()+","+
                        ((Villa) key).getRoomStandard()+","+((Villa) key).getAreaPool()+","+
                        ((Villa) key).getNumOfFloors());
                bufferedWriters[1].newLine();
                bufferedWriters[1].close();
            } else if (key instanceof Room) {
                bufferedWriters[2].write(((Room) key).getServiceID()+","+((Room) key).getNameOfService()+","+
                        ((Room) key).getAreaUsed()+","+((Room) key).getRentalCost()+","+((Room) key).getMaxNumOfCustomer()
                        +","+((Room) key).getTypeRent()+","+((Room) key).getFreeService());
                bufferedWriters[2].newLine();
                bufferedWriters[2].close();
            }
        }
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
                try {
                    writeFileOfFacility();
                } catch (IOException e) {
                    System.out.println("Lỗi nhập xuất");
                }
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
                try {
                    writeFileOfFacility();
                } catch (IOException e) {
                    System.out.println("Lỗi nhập xuất");
                }
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
                try {
                    writeFileOfFacility();
                } catch (IOException e) {
                    System.out.println("Lỗi nhập xuất");
                }
                break;
            default:
                System.out.println("Invalid!!!");
        }
    }
}
