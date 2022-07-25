package case_study_module2.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public abstract class Person {
    private String fullName;
    private LocalDate dateOfBirth;
    private boolean gender;
    private long identityCardNum;
    private long phoneNumber;
    private String mail;
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Person() {
    }

    public static void checkAge(Date date) {
        Date nowDate = new Date();

    }
    public Person(String fullName,String birthday, boolean gender, long identityCardNum, long phoneNumber,
                  String mail) {
        this.fullName = fullName;
        this.gender = gender;
        this.identityCardNum = identityCardNum;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        dateOfBirth = LocalDate.parse(birthday,dateTimeFormatter);
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth,dateTimeFormatter);
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
