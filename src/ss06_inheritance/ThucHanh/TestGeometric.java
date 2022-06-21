package ss06_inheritance.ThucHanh;

public class TestGeometric {
    public static void main(String[] args) {
        Geometric geo1 = new Geometric("Blue",true);
        System.out.println(geo1.toString());
        Geometric geo2 = new Geometric("Yellow",false);
        System.out.println(geo2.toString());
    }
}
