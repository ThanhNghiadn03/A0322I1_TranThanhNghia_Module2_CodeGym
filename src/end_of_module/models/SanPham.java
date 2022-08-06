package end_of_module.models;

public abstract class SanPham {
    private static int idProduct = 0;
    private String maSanPham;
    private String tenSanPham;
    private long giaBan;
    private int soLuong;
    private String nhaSanXuat;

    public SanPham() {
        idProduct++;
    }

    abstract void tangID();

    public SanPham(String productCode, String tenSanPham,
                   long giaBan, int soLuong, String nhaSanXuat) {
        idProduct++;
        this.maSanPham = productCode;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "id : " + idProduct +
                ", productCode : " + maSanPham+
                ", nameProduct : " + tenSanPham+
                ", price : " + giaBan +
                ", numbers : " + soLuong +
                ", manufacturer : " + nhaSanXuat;
    }
}
