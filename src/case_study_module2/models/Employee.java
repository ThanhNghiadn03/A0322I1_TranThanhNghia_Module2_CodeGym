package case_study_module2.models;

import java.util.Date;

public class Employee extends Person{
    private java.lang.String empID;
    private java.lang.String academicLevel;
    private String position;
    private long salary;

    enum pos {
        receptionist,
        waitress,
        expert,
        supervisor,
        manager,
        director
    }

    enum level {
        Intermediate,
        college,
        university,
        graduated
    }

    public Employee() {
    }

    public Employee(java.lang.String empID, java.lang.String academicLevel, String position, long salary) {
        this.empID = empID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(java.lang.String fullName, String dateOfBirth, boolean gender, long identityCardNum,
                    long phoneNumber, java.lang.String mail, java.lang.String empID, java.lang.String academicLevel,
                    String position, long salary) {
        super(fullName, dateOfBirth, gender, identityCardNum, phoneNumber, mail);
        this.empID = empID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public java.lang.String getEmpID() {
        return empID;
    }

    public void setEmpID(java.lang.String empID) {
        this.empID = empID;
    }

    public java.lang.String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(java.lang.String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public java.lang.String toString() {
        return "Employee{"+ "Name : "+super.getFullName()+" , identity card number : "+super.getIdentityCardNum()+
                " , " +"gender : "+(super.isGender()==true ? "Nam" : "Nữ")+" , mail : "+super.getMail()+
                " , phone number : "+super.getPhoneNumber()+
                " , empID='" + empID + '\'' +
                ", academicLevel=" + academicLevel +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
