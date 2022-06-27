package case_study_module2.models;

public abstract class Person {
    private String fullName;
    private String dateOfBirth;
    private boolean gender;
    private long identityCardNum;
    private long phoneNumber;
    private String mail;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, boolean gender, long identityCardNum, long phoneNumber, String mail) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCardNum = identityCardNum;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getIdentityCardNum() {
        return identityCardNum;
    }

    public void setIdentityCardNum(long identityCardNum) {
        this.identityCardNum = identityCardNum;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
