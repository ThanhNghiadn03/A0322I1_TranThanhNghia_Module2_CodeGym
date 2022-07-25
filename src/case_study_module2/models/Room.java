package case_study_module2.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceID , String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer,
                String typeRent, String freeService) {
        super(serviceID,nameOfService, areaUsed, rentalCost, maxNumOfCustomer, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + " Name of service : "+ super.getNameOfService()+
                " , area : "+super.getAreaUsed()+" , rental cost : "+super.getRentalCost()+
                " , number of customer : "+super.getMaxNumOfCustomer()+" , type rent : "+super.getTypeRent()+
                " , freeService='" + freeService + '\'' +
                '}';
    }
}
