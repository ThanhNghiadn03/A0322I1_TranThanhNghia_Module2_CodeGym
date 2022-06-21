package ss05_static_access_modifier.ThucHanh.StaticMethod;

public class Student {
    private int rollNo;
    private String name;
    public static String college = "Duy Tan";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +", college='"+Student.college+ '\''+
                '}';
    }

    static void change() {
        Student.college = "CodeGym";
    }
}
