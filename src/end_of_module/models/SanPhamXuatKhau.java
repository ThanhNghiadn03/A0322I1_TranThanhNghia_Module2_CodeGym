package end_of_module.models;

public class SanPhamXuatKhau extends SanPham{
    private long giaXuatKhau;
    private String quocGiaNhapSp;
    public static String idSanPhamXK;

    @Override
    void tangID() {

    }

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(long giaXuatKhau, String quocGiaNhapSp) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSp = quocGiaNhapSp;
    }

    public SanPhamXuatKhau(String productCode, String tenSanPham, long giaBan, int soLuong, String nhaSanXuat,
                           long giaXuatKhau, String quocGiaNhapSp) {
        super(productCode, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSp = quocGiaNhapSp;
    }

    public long getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(long giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSp() {
        return quocGiaNhapSp;
    }

    public void setQuocGiaNhapSp(String quocGiaNhapSp) {
        this.quocGiaNhapSp = quocGiaNhapSp;
    }

    @Override
    public String toString() {
        return "San Pham Xuat Khau : "+super.toString()+"," +
                "gia Xuat Khau " + giaXuatKhau +
                " quocGiaNhapSp " + quocGiaNhapSp +
                "\n";
    }
}
