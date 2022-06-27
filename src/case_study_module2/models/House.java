package case_study_module2.models;

public class House extends Facility {
    private String roomStandard;
    private byte numOfFloors;

    public House() {
    }

    public House(String roomStandard, byte numOfFloors) {
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public House(String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer, String typeRent, String roomStandard, byte numOfFloors) {
        super(nameOfService, areaUsed, rentalCost, maxNumOfCustomer, typeRent);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }
}
