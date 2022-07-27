package ss17_binary_file.BaiTap.quanLySP;

import java.io.*;
import java.util.Scanner;

public class BinaryStream {
    public static final String binaryFile = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss17_binary_file\\BaiTap\\quanLySP\\Product.dat";

    public static void writeProduct(Product product) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(binaryFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);
        objectOutputStream.close();
    }

    public static Product readProduct(String pathFile) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(pathFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Product product = (Product) objectInputStream.readObject();
        return product;
    }
    public static void addNewProduct() throws IOException {
        Product product;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào tên : ");
        String name = scanner.nextLine();
        System.out.printf("Nhập vào id : ");
        String idProduct = scanner.nextLine();
        System.out.printf("Nhập vào nhà sản xuất : ");
        String manufacturer = scanner.nextLine();
        System.out.printf("Nhập vào đơn giá : ");
        long price = Long.parseLong(scanner.nextLine());
        System.out.printf("Nhập vào tình trạng sản phẩm : ");
        String status = scanner.nextLine();
        product = new Product(name,idProduct,manufacturer,price,status);
        BinaryStream.writeProduct(product);
    }

    public static void displayProduct(String pathfile) throws IOException, ClassNotFoundException {
        System.out.println(readProduct(pathfile));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Thêm mới sản phẩm : ");
        BinaryStream.addNewProduct();
        System.out.println("Hiển thị sản phẩm : ");
        displayProduct(binaryFile);
    }
}
