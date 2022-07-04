package case_study_module2.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer, Last typeRent, String freeService) {
        super(nameOfService, areaUsed, rentalCost, maxNumOfCustomer, typeRent);
        this.freeService = freeService;
    }
}
