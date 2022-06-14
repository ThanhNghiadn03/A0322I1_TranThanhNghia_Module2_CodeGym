package ss03_mang_phuongthuc_java.ThucHanh.TimGiaTri;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        String[] name = {"Nghia","Thu","Chau","Nhi","Linh","Khoa","Trang","Tan","Thao","Kien"};
        String search = "";
        boolean confirm = false;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the name who you need to find : ");
        search = scanner.nextLine();
        for (int i=0 ; i<name.length ; i++) {
            if (name[i].equals(search)) {
                System.out.printf("Position of \"" + search + "\" in the list is "+(i+1));
                confirm = true;
                break;
            }
        }

        if (confirm != true) {
            System.out.println("Not found !!!");
        }
    }
}
