package case_study_module2.models;

public abstract class Facility {
    private String serviceID;
    private String nameOfService;
    private double areaUsed;
    private double rentalCost;
    private int maxNumOfCustomer;
    private  String typeRent;

    enum Last {
        year,
        month,
        day,
        hour
    }

    public Facility() {
    }

    public Facility(String serviceID,String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer,
                    String typeRent) {
        this.serviceID = serviceID;
        this.nameOfService = nameOfService;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.maxNumOfCustomer = maxNumOfCustomer;
        this.typeRent = typeRent;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumOfCustomer() {
        return maxNumOfCustomer;
    }

    public void setMaxNumOfCustomer(int maxNumOfCustomer) {
        this.maxNumOfCustomer = maxNumOfCustomer;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
}
