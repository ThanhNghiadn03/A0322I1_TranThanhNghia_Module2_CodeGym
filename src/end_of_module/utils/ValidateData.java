package end_of_module.utils;

public class ValidateData {
    public static boolean validate(int x) {
        if (x<=0) {
            System.out.println("Du lieu ban nhap khong hop le !!!");
            return false;
        } else return true;
    }
    public static boolean validate(long x) {
        if (x<=0) {
            System.out.println("Du lieu ban nhap khong hop le !!!");
            return false;
        } else return true;
    }
}
