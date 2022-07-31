package case_study_module2.models;

import case_study_module2.services.CustomerServiceImpl;

import java.util.Date;

public class Customer extends Person{
    private String customID;
    private String customType;
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

    public Customer(String customID, String customType, String address) {
        this.customID = customID;
        this.customType = customType;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, boolean gender, long identityCardNum,
                    long phoneNumber, String mail, String customID, String customType, String address) {
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

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
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
        return "{" + " customID= " + customID+" , date of birth : "+super.getDateOfBirth()+
                " , gender : "+(super.isGender()==true ? "Nam":"Nữ")+" , CMND : "+super.getIdentityCardNum()+
                " , phone number : "+super.getPhoneNumber()+" , mail : "+super.getMail()+
                " , name = "+super.getFullName()+
                ", customType= " + customType +
                ", address= " + address +
                "}\n";
    }
}
