package case_study_module2.models;

public abstract class Facility {
    private String nameOfService;
    private double areaUsed;
    private double rentalCost;
    private int maxNumOfCustomer;
    private  Last typeRent;

    enum Last {
        year,
        month,
        day,
        hour
    }

    public Facility() {
    }

    public Facility(String nameOfService, double areaUsed, double rentalCost, int maxNumOfCustomer, Last typeRent) {
        this.nameOfService = nameOfService;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.maxNumOfCustomer = maxNumOfCustomer;
        this.typeRent = typeRent;
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

    public Last getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(Last typeRent) {
        this.typeRent = typeRent;
    }
}
