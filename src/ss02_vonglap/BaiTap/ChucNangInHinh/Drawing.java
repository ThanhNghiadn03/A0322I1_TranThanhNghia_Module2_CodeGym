package ss02_vonglap.BaiTap.ChucNangInHinh;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        System.out.println("Menu : ");
        System.out.println("1. Draw the rectangle.");
        System.out.println("2. Draw the square triangle.");
        System.out.println("3. Draw the isosceles triangle.");
        byte choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        choice = scanner.nextByte();
        switch (choice) {
            case 1 :
                for (int i=0 ; i<5 ; i++) {
                    for (int j=0 ; j<3 ; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2 :
                for (int i=0 ; i<5 ; i++) {
                    for (int j=0 ; j<(i+1) ; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.println("");
                }
                System.out.println("\n\n\n");
                for (int i=0 ; i<5 ; i++) {
                    for (int j=5 ; j>i ; j--) {
                        System.out.printf(" * ");
                    }
                    System.out.println("");
                }
                System.out.println("\n\n\n");

                for (int i=0 ; i<5 ; i++) {
                    int thieu = 4-i;
                    for (; thieu >0 ; thieu--) {
                        System.out.printf("   ");
                    }
                    for (int j=i ; j>=0 ; j--) {
                        System.out.printf(" * ");
                    }
                    System.out.printf("\n");
                }

                System.out.println("\n\n\n");
                for (int i=4 ; i>=0 ; i--) {
                    int thieu = 4-i;
                    for (; thieu >0 ; thieu--) {
                        System.out.printf("   ");
                    }
                    for (int j=i ; j>=0 ; j--) {
                        System.out.printf(" * ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 3 :
                int row = 5;
                int coll = 5;
                for (int i=0 ; i<row ; i++) {
                    for (int j=1 ; j<=coll; j++) {
                        if (j<(row-i)) {
                            System.out.printf("   ");
                        } else {
                            System.out.printf("*  ");
                        }
                    }
                    coll++;
                    System.out.printf("\n");
                }
                break;
        }
    }
}
