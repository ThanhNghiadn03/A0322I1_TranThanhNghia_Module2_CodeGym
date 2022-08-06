package end_of_module.services;

import end_of_module.models.SanPhamNhapKhau;
import end_of_module.models.SanPhamXuatKhau;

import java.io.FileNotFoundException;

public class HienThiDanhSach {
    public static void hienThiDanhSach() {
        try {
            DocGhiFile.DocFileNhapKhau();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            DocGhiFile.DocFileXuatKhau();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("Danh sach san pham nhap khau : ");
        for (SanPhamNhapKhau sanPhamNhapKhau : DanhSach.nhapKhauList) {
            System.out.println(sanPhamNhapKhau);
        }
        System.out.println("\n\nDanh sach san pham xuat khau : ");
        for (SanPhamXuatKhau sanPhamXuatKhau : DanhSach.xuatKhauList) {
            System.out.println(sanPhamXuatKhau);
        }
    }
}
