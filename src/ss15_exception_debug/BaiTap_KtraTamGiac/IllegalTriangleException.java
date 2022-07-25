package ss15_exception_debug.BaiTap_KtraTamGiac;

public class IllegalTriangleException extends Exception {
    public static void checkingTriangle(int a , int b , int c) throws IllegalTriangleException {
        if ((a+b)<=c || (a+c)<=b || (b+c)<=a) {
            throw new IllegalTriangleException("3 canh tam giac khong hop le");
        } else if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("3 canh tam giac khong hop le");
        } else {
            System.out.println("Tam giac binh thuong");
        }
    }
    public IllegalTriangleException(String message) {
        super(message);
    }
}
