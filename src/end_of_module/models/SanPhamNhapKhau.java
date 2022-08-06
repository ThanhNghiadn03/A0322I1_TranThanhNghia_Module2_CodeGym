package end_of_module.models;

public class SanPhamNhapKhau extends SanPham {
    private long giaNhapKhau;
    private String tinhThanhNhap;
    private long thueNhapKhau;
    public static String idSanPhamNK;
    public SanPhamNhapKhau() {
    }

    @Override
    void tangID() {

    }

    public SanPhamNhapKhau(long giaNhapKhau, String tinhThanhNhap, long thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(String productCode, String tenSanPham, long giaBan,
                           int soLuong, String nhaSanXuat, long giaNhapKhau, String tinhThanhNhap, long thueNhapKhau) {
        super(productCode, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public long getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(long giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public long getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(long thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return " San Pham Nhap Khau " + super.toString()+
                " gia Nhap Khau :" + giaNhapKhau +
                ", tinh Thanh Nhap : " + tinhThanhNhap +
                ", thue Nhap Khau : " + thueNhapKhau +
                "\n";
    }
}
