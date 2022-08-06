package end_of_module.services;

import end_of_module.models.SanPhamNhapKhau;
import end_of_module.models.SanPhamXuatKhau;

import java.util.Scanner;

public class TimKiem {
    public static void timKiemSanPham() {
        System.out.println("Ban muon tim kiem san pham theo gi ?");
        System.out.println("1.Theo ma san pham");
        System.out.println("2.Theo ten san pham");
        System.out.println("3. Quay lai");
        System.out.print("\nChon 1 trong 3 chuc nang : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        switch (choose) {
            case 1 :
                timKiemSpTheoMaSp();
                break;
            case 2 :
                timKiemSpTheoTenSp();
                break;
            case 3 :
                break;
            default:
                System.out.println("Ban nhap khong hop le vui long nhap lai !!!");
                timKiemSanPham();
                break;
        }
    }

    public static void timKiemSpTheoMaSp() {
        System.out.print("Nhap vao ma san pham : ");
        String maSanPham;
        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        maSanPham = scanner.nextLine();
        for (SanPhamXuatKhau sanPhamXuatKhau : DanhSach.xuatKhauList) {
            if (sanPhamXuatKhau.getMaSanPham().equals(maSanPham)) {
                System.out.println(sanPhamXuatKhau);
                isExist = true;
            }
        }
        for (SanPhamNhapKhau sanPhamNhapKhau : DanhSach.nhapKhauList) {
            if (sanPhamNhapKhau.getMaSanPham().equals(maSanPham)) {
                System.out.println(sanPhamNhapKhau);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Khong ton tai san pham ban dang tim");
        }
    }

    public static void timKiemSpTheoTenSp() {
        System.out.print("Nhap vao ten san pham : ");
        String tenSanPham;
        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        tenSanPham = scanner.nextLine();
        for (SanPhamXuatKhau sanPhamXuatKhau : DanhSach.xuatKhauList) {
            if (sanPhamXuatKhau.getTenSanPham().equals(tenSanPham)) {
                System.out.println(sanPhamXuatKhau);
                isExist = true;
            }
        }
        for (SanPhamNhapKhau sanPhamNhapKhau : DanhSach.nhapKhauList) {
            if (sanPhamNhapKhau.getTenSanPham().equals(tenSanPham)) {
                System.out.println(sanPhamNhapKhau);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Khong ton tai san pham ban dang tim");
        }
    }
}
