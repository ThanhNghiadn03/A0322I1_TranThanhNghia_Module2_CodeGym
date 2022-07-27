package ss17_binary_file.BaiTap.quanLySP;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String idProduct;
    private String manufacturer;
    private long price;
    private String status;

    public Product(String name, String idProduct, String manufacturer,
                   long price, String status) {
        this.name = name;
        this.idProduct = idProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.status = status;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", idProduct='" + idProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
