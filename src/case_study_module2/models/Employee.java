package case_study_module2.models;

public class Employee extends Person{
    private String empID;
    private String academicLevel;
    private String position;
    private long salary;

    public Employee() {
    }

    public Employee(String empID, String academicLevel, String position, long salary) {
        this.empID = empID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String fullName, String dateOfBirth, boolean gender, long identityCardNum, long phoneNumber, String mail, String empID, String academicLevel, String position, long salary) {
        super(fullName, dateOfBirth, gender, identityCardNum, phoneNumber, mail);
        this.empID = empID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
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
}
