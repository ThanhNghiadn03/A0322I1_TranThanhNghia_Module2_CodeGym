package case_study_module2.models;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int numOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double areaPool, int numOfFloors) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numOfFloors = numOfFloors;
    }

    public Villa(String serviceID , String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer, String typeRent,
                 String roomStandard, double areaPool, int numOfFloors) {
        super(serviceID,nameOfService, areaUsed, rentalCost, maxNumOfCustomer, typeRent);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(byte numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{"  + " Name of service : "+ super.getNameOfService()+
                " , area : "+super.getAreaUsed()+" , rental cost : "+super.getRentalCost()+
                " , number of customer : "+super.getMaxNumOfCustomer()+" , type rent : "+super.getTypeRent()+
                " , roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", numOfFloors=" + numOfFloors +
                '}';
    }
}
