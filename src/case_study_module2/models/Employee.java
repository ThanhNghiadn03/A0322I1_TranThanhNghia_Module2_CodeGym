package case_study_module2.models;

public class Employee extends Person{
    private String empID;
    private level academicLevel;
    private pos position;
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

    public Employee(String empID, level academicLevel, pos position, long salary) {
        this.empID = empID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String fullName, String dateOfBirth, boolean gender, long identityCardNum, long phoneNumber, String mail, String empID, level academicLevel, pos position, long salary) {
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

    public level getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(level academicLevel) {
        this.academicLevel = academicLevel;
    }

    public pos getPosition() {
        return position;
    }

    public void setPosition(pos position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"+ "Name : "+super.getFullName()+" , identity card number : "+super.getIdentityCardNum()+" , " +
                "empID='" + empID + '\'' +
                ", academicLevel=" + academicLevel +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
