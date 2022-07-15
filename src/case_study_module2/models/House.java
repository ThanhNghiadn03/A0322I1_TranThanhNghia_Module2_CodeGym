package case_study_module2.models;

public class House extends Facility {
    private String roomStandard;
    private int numOfFloors;

    public House() {
    }

    public House(String roomStandard, byte numOfFloors) {
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public House(String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer, String typeRent,
                 String roomStandard, int numOfFloors) {
        super(nameOfService, areaUsed, rentalCost, maxNumOfCustomer, typeRent);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }
}
