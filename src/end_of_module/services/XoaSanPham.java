package end_of_module.services;

import end_of_module.models.SanPhamNhapKhau;
import end_of_module.models.SanPhamXuatKhau;

import java.io.IOException;
import java.util.Scanner;

public class XoaSanPham {
    public static void xoaSanPham() {
        System.out.println("Ban phai chon 1 trong hai loai san pham de xoa : ");
        System.out.println("1. San pham nhap khau.");
        System.out.println("2. San Pham xuat khau.");
        System.out.println("3. Quay lai");
        System.out.print("\nChon 1 trong 3 chuc nang : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        switch (choose) {
            case 1 :
                xoaSanPhamNhapKhau();
                break;
            case 2 :
                xoaSanPhamXuatKhau();
                break;
            case 3 :
                break;
            default:
                System.out.println("Ban nhap khong hop le vui long nhap lai !!!");
                xoaSanPham();
                break;
        }
    }
    public static void xoaSanPhamNhapKhau() {
        System.out.print("Ban phai nhap vao ma san pham : ");
        String maSanPham;
        Scanner scanner = new Scanner(System.in);
        maSanPham = scanner.nextLine();
        int index = 0;
        for (SanPhamNhapKhau sanPhamNhapKhau : DanhSach.nhapKhauList) {
            if (sanPhamNhapKhau.getMaSanPham().equals(maSanPham)) {
                DanhSach.nhapKhauList.remove(sanPhamNhapKhau);
                System.out.println("Da xoa san pham !");
            }
        }
        try {
            DocGhiFile.ghiFileNhapKhau();
        } catch (IOException e) {
            System.out.println("Loi nhap xuat");
        }
    }

    public static void xoaSanPhamXuatKhau() {
        System.out.print("Ban phai nhap vao ma san pham : ");
        String maSanPham;
        Scanner scanner = new Scanner(System.in);
        maSanPham = scanner.nextLine();
        int index = 0;
        for (SanPhamXuatKhau sanPhamXuatKhau : DanhSach.xuatKhauList ){
            if (sanPhamXuatKhau.getMaSanPham().equals(maSanPham)) {
                DanhSach.xuatKhauList.remove(sanPhamXuatKhau);
                System.out.println("Da xoa san pham !");
            }
        }
        try {
            DocGhiFile.ghiFileXuatKhau();
        } catch (IOException e) {
            System.out.println("Loi nhap xuat");
        }
    }
}
