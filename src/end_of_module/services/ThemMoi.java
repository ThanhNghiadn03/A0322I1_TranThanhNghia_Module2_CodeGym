package end_of_module.services;

import end_of_module.models.SanPhamNhapKhau;
import end_of_module.models.SanPhamXuatKhau;
import end_of_module.utils.ValidateData;

import java.io.IOException;
import java.util.Scanner;

public class ThemMoi {
    public static void themMoi() {
        System.out.println("Ban muon them moi loai san pham nao ? ");
        System.out.println("1. San pham nhap khau.");
        System.out.println("2. San Pham xuat khau.");
        System.out.println("3. Quay lai");
        System.out.print("\nChon 1 trong 2 chuc nang : ");
        byte choose = 1;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextByte();
        switch (choose) {
            case 1 :
                themMoiSPNhapKhau();
                break;
            case 2 :
                themMoiSPXuatKhau();
                break;
            case 3 :
                break;
            default:
                System.out.println("Ban nhap khong hop le vui long nhap lai !!!");
                themMoi();
                break;
        }
    }
    public static void themMoiSPNhapKhau() {
        String maSanPham;
        String tenSanPham;
        long giaBan;
        int soLuong;
        String nhaSanXuat;
        long giaNhapKhau;
        String tinhThanhNhap;
        long thueNhapKhau;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao ma san pham : ");
        maSanPham = scanner.nextLine();
        System.out.printf("Nhap vao ten san pham : ");
        tenSanPham = scanner.nextLine();
        System.out.printf("Nhap vao gia ban : ");
        giaBan = Long.parseLong(scanner.nextLine());
        while (!ValidateData.validate(giaBan)) {
            System.out.println("Vui long nhap lai !!!");
            giaBan = Long.parseLong(scanner.nextLine());
        }
        System.out.printf("Nhap vao so luong : ");
        soLuong = Integer.parseInt(scanner.nextLine());
        while (!ValidateData.validate(soLuong)) {
            System.out.println("Vui long nhap lai !!!");
            soLuong = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Nhap vao nha san xuat : ");
        nhaSanXuat = scanner.nextLine();
        System.out.printf("Nhap vao gia nhap khau : ");
        giaNhapKhau = Long.parseLong(scanner.nextLine());
        while (!ValidateData.validate(giaNhapKhau)) {
            System.out.println("Vui long nhap lai !!!");
            giaNhapKhau = Long.parseLong(scanner.nextLine());
        }
        System.out.printf("Nhap vao tinh thanh da nhap : ");
        tinhThanhNhap = scanner.nextLine();
        System.out.printf("Nhap vao thue nhap khau : ");
        thueNhapKhau = Long.parseLong(scanner.nextLine());
        while (!ValidateData.validate(thueNhapKhau)) {
            System.out.println("Vui long nhap lai !!!");
            thueNhapKhau = Long.parseLong(scanner.nextLine());
        }
        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,
                            tinhThanhNhap,thueNhapKhau);
        DanhSach.nhapKhauList.add(sanPhamNhapKhau);
        try {
            DocGhiFile.ghiFileNhapKhau();
        } catch (IOException e) {
            System.out.println("Loi nhap xuat");
        }
        System.out.println("Them moi thanh cong");
    }
    public static void themMoiSPXuatKhau() {
        String maSanPham;
        String tenSanPham;
        long giaBan;
        int soLuong;
        String nhaSanXuat;
        long giaXuatKhau;
        String quocGiaNhapSp;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao ma san pham : ");
        maSanPham = scanner.nextLine();
        System.out.printf("Nhap vao ten san pham : ");
        tenSanPham = scanner.nextLine();
        System.out.printf("Nhap vao gia ban : ");
        giaBan = Long.parseLong(scanner.nextLine());
        while (!ValidateData.validate(giaBan)) {
            System.out.println("Vui long nhap lai !!!");
            giaBan = Long.parseLong(scanner.nextLine());
        }
        System.out.printf("Nhap vao so luong : ");
        soLuong = Integer.parseInt(scanner.nextLine());
        while (!ValidateData.validate(soLuong)) {
            System.out.println("Vui long nhap lai !!!");
            soLuong = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Nhap vao nha san xuat : ");
        nhaSanXuat = scanner.nextLine();
        System.out.printf("Nhap vao gia xuat khau : ");
        giaXuatKhau = Long.parseLong(scanner.nextLine());
        while (!ValidateData.validate(giaXuatKhau)) {
            System.out.println("Vui long nhap lai !!!");
            giaXuatKhau = Long.parseLong(scanner.nextLine());
        }
        System.out.printf("Nhap vao quoc gia nhap san pham : ");
        quocGiaNhapSp = scanner.nextLine();
        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,
                giaXuatKhau,quocGiaNhapSp);
        DanhSach.xuatKhauList.add(sanPhamXuatKhau);
        try {
            DocGhiFile.ghiFileXuatKhau();
        } catch (IOException e) {
            System.out.println("Loi nhap xuat");
        }
        System.out.println("Them moi thanh cong");
    }
}
