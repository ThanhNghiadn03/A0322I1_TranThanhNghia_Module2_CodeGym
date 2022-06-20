package ss04_class_object_java.BaiTap.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.fast, true, 10, "Yellow");
        Fan fan2 = new Fan(Fan.medium, false, 5, "Blue");
        System.out.printf(fan1.toString());
        System.out.printf("\n\n"+fan2.toString());
    }
}
