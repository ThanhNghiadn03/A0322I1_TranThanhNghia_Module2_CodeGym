package ss05_static_access_modifier.ThucHanh.StaticMethod;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(111,"Nghia");
        Student s2 = new Student(222,"Hoang");
        Student s3 = new Student(333,"Khanh");
        System.out.printf(s1.toString() + "\n" + s2.toString() + "\n" + s3.toString());
        Student.change();
        System.out.printf("\n\n\n"+s1.toString()+"\n"+s2.toString()+"\n"+s3.toString());
    }

}
