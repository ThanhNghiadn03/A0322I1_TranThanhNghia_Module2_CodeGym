package case_study_module2.models;

public class Customer extends Person{
    private String customID;
    private type customType;
    private String address;

    enum type {
        Diamond,
        Platinium,
        Gold,
        Silver,
        Member
    }

    public Customer() {
    }

    public Customer(String customID, type customType, String address) {
        this.customID = customID;
        this.customType = customType;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, boolean gender, long identityCardNum, long phoneNumber, String mail, String customID, type customType, String address) {
        super(fullName, dateOfBirth, gender, identityCardNum, phoneNumber, mail);
        this.customID = customID;
        this.customType = customType;
        this.address = address;
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public type getCustomType() {
        return customType;
    }

    public void setCustomType(type customType) {
        this.customType = customType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customID='" + customID + '\'' +
                ", customType=" + customType +
                ", address='" + address + '\'' +
                '}';
    }
}
