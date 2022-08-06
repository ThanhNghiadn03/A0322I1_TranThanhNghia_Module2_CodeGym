package end_of_module.services;

import end_of_module.models.SanPhamNhapKhau;
import end_of_module.models.SanPhamXuatKhau;

import java.io.*;

public class DocGhiFile {
    public static final String nhapKhauFile = "E:\\A0322I1_TranThanhNghia_Module2\\src\\end_of_module\\data\\SanPhamNhapKhau.CSV";
    public static final String xuatKhauFile = "E:\\A0322I1_TranThanhNghia_Module2\\src\\end_of_module\\data\\SanPhamXuatKhau.CSV";
    public static void DocFileNhapKhau() throws FileNotFoundException {
        FileReader fileReader = new FileReader(nhapKhauFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        SanPhamNhapKhau sanPhamNhapKhau;
        try {
            while ((line = bufferedReader.readLine())!= null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String maSanPham = temp[1];
                String tenSanPham = temp[2];
                long giaBan = Long.parseLong(temp[3]);
                int soLuong = Integer.parseInt(temp[4]);
                String nhaSanXuat = temp[5];
                long giaNhapKhau = Long.parseLong(temp[6]);
                String tinhThanhNhap = temp[7];
                long thueNhapKhau = Long.parseLong(temp[8]);
                sanPhamNhapKhau = new SanPhamNhapKhau(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,
                        tinhThanhNhap,thueNhapKhau);
                DanhSach.nhapKhauList.add(sanPhamNhapKhau);
            }
        } catch (IOException e) {
            System.out.println("Loi nhap xuat");
        }
    }

    public static void DocFileXuatKhau() throws FileNotFoundException {
        FileReader fileReader = new FileReader(xuatKhauFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        SanPhamXuatKhau sanPhamXuatKhau;
        try {
            while ((line = bufferedReader.readLine())!= null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String maSanPham = temp[1];
                String tenSanPham = temp[2];
                long giaBan = Long.parseLong(temp[3]);
                int soLuong = Integer.parseInt(temp[4]);
                String nhaSanXuat = temp[5];
                long giaXuatKhau = Long.parseLong(temp[6]);
                String quocGiaNhapSp = temp[7];
                sanPhamXuatKhau = new SanPhamXuatKhau(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaXuatKhau,quocGiaNhapSp);
                DanhSach.xuatKhauList.add(sanPhamXuatKhau);
            }
        } catch (IOException e) {
            System.out.println("Loi nhap xuat");
        }
    }
    public static void ghiFileNhapKhau() throws IOException {
        FileWriter fileWriter = new FileWriter(nhapKhauFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (SanPhamNhapKhau sanPhamNhapKhau : DanhSach.nhapKhauList) {
            bufferedWriter.write(sanPhamNhapKhau.getIdProduct()+","+sanPhamNhapKhau.getMaSanPham()+","
                    +sanPhamNhapKhau.getTenSanPham()+","+
                    sanPhamNhapKhau.getGiaBan()+","+sanPhamNhapKhau.getSoLuong()+","+sanPhamNhapKhau.getNhaSanXuat()+","+
                    sanPhamNhapKhau.getGiaNhapKhau()+","+sanPhamNhapKhau.getTinhThanhNhap()+","+
                    sanPhamNhapKhau.getThueNhapKhau());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
    public static void ghiFileXuatKhau() throws IOException {
        FileWriter fileWriter = new FileWriter(xuatKhauFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (SanPhamXuatKhau sanPhamXuatKhau : DanhSach.xuatKhauList) {
            bufferedWriter.write(sanPhamXuatKhau.getIdProduct()+","+sanPhamXuatKhau.getMaSanPham()+","
                    +sanPhamXuatKhau.getTenSanPham()+","+
                    sanPhamXuatKhau.getGiaBan()+","+sanPhamXuatKhau.getSoLuong()+","+sanPhamXuatKhau.getNhaSanXuat()+","+
            sanPhamXuatKhau.getGiaXuatKhau()+","+sanPhamXuatKhau.getQuocGiaNhapSp());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
