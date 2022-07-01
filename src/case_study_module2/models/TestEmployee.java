package case_study_module2.models;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Nghia","21/06/2003",true,1222,1099,"mail","EP111", Employee.level.university, Employee.pos.manager,12000);
        System.out.println(employee.toString());
    }

}
