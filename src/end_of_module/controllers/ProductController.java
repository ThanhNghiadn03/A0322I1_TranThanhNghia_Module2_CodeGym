package end_of_module.controllers;

import end_of_module.services.HienThiDanhSach;
import end_of_module.services.ThemMoi;
import end_of_module.services.TimKiem;
import end_of_module.services.XoaSanPham;

import java.util.Scanner;

public class ProductController {
    public static void displayMainMenu() {
        System.out.println("\nMAIN MENU\n");
        System.out.println("1. Them moi");
        System.out.println("2. Xoa");
        System.out.println("3. Xem danh sach cac san pham");
        System.out.println("4. Tim kiem");
        System.out.println("5. Thoat");
        System.out.print("\nChoose 1 of functions : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        switch (choose) {
            case 1 :
                ThemMoi.themMoi();
                displayMainMenu();
                break;
            case 2 :
                XoaSanPham.xoaSanPham();
                displayMainMenu();
                break;
            case 3 :
                HienThiDanhSach.hienThiDanhSach();
                displayMainMenu();
                break;
            case 4 :
                TimKiem.timKiemSanPham();
                displayMainMenu();
                break;
            case 5 :
                break;
            default:
                System.out.println("Ban nhap khong hop le vui long nhap lai !!!");
                displayMainMenu();
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
