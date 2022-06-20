package ss04_class_object_java.ThucHanh.Rectangle;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rec1;
        Scanner scanner = new Scanner(System.in);
        double width1 , height1;
        System.out.printf("Enter the width : ");
        width1 = scanner.nextDouble();
        System.out.printf("Enter the height : ");
        height1 =scanner.nextDouble();
        rec1 = new Rectangle(width1,height1);
        System.out.printf("\nYour rectangle : "+rec1.display());
        System.out.printf("\nArea : "+rec1.getArea());
        System.out.printf("\nPerimeter : "+rec1.getPerimeter());
    }
}
