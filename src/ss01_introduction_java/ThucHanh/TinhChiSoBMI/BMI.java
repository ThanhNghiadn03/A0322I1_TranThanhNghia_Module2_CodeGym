package ss01_introduction_java.ThucHanh.TinhChiSoBMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter weight : ");
        weight = scanner.nextFloat();
        System.out.printf("Enter height : ");
        height = scanner.nextFloat();
        float bmi;
        bmi = weight/(height*height);
        System.out.println("BMI : "+bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
