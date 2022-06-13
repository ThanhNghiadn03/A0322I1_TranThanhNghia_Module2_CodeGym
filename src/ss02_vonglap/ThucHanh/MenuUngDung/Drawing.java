package ss02_vonglap.ThucHanh.MenuUngDung;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        byte choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw the triangle.");
        System.out.println("2.Draw the square.");
        System.out.println("3.Draw the rectangle.");
        System.out.print("Choose 1 of those function : ");
        choice = scanner.nextByte();
        switch (choice) {
            case 1 :
                for (int i=0 ; i<5 ; i++) {
                    for (int j=0 ; j<(i+1) ; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2 :
                for (int i=0 ; i<5 ; i++) {
                    for (int j=0 ; j<5 ; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 3 :
                for (int i=0 ; i<5 ; i++) {
                    for (int j=0 ; j<3 ; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Invalid !!!");
        }
    }
}
