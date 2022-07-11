package ss12_java_collection_framework.BaiTap.ArrayList_LinkedList;

import java.util.*;
import java.util.Comparator;

public class ManagerProduct {
    public static List<Product> listProductArrayList = new ArrayList<>();
    public static List<Product> listProductLinkedList = new LinkedList<>();
    public static void addNewProductArrayList() {
        Product product = new Product();
        String id , name;
        int price;
        System.out.print("Nhập vào id : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Nhập vào tên sản phầm : ");
        name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm : ");
        price = scanner.nextInt();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        listProductArrayList.add(product);
    }
    public static void displayProductArrayList() {
        System.out.println("\nDanh sách sản phẩm : ");
        for (Product product : listProductArrayList) {
            System.out.println(product);
        }
    }

    public static void editProductByIdArrayList() {
        String id,name;
        int price;
        System.out.print("\nNhập vào id sản phẩm bạn muốn chỉnh sửa : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Chỉnh sửa tên : ");
        name = scanner.nextLine();
        System.out.print("Chỉnh sửa giá : ");
        price = scanner.nextInt();
        Product editProduct = new Product(id,name,price);
        int n=0;
        for (Product product : listProductArrayList) {
            if (product.getId().equals(id)) {
                n = listProductArrayList.indexOf(product);
            }
        }
        listProductArrayList.add(n,editProduct);
        listProductArrayList.remove(n+1);
    }
    public static void deleteProductByIdArrayList() {
        String id;
        System.out.print("Nhập vào id sản phẩm bạn muốn xóa : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        for (Product product : listProductArrayList) {
            if (product.getId().equals(id)) {
                listProductArrayList.remove(product);
            }
        }
    }

    public static void searchProductByNameArrayList() {
        String name;
        System.out.print("Nhập vào tên sản phẩm bạn muốn tìm : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        for (Product product : listProductArrayList) {
            if (product.getName().equals(name)) {
                System.out.println("Thông tin sản phẩm : "+product);
            }
        }
    }

    public static void sortDescendingByPriceArrayList() {
        System.out.println("\nSắp xếp giảm dần sản phẩm theo giá : ");
        Collections.sort(listProductArrayList,new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static void sortAscendingByPriceArrayList() {
        System.out.println("\nSắp xếp tăng dần sản phẩm theo giá : ");
        Collections.sort(listProductArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static void addNewProductLinkedList() {
        Product product = new Product();
        String id , name;
        int price;
        System.out.print("Nhập vào id : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Nhập vào tên sản phầm : ");
        name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm : ");
        price = scanner.nextInt();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        listProductLinkedList.add(product);
    }

    public static void displayProductLinkedList() {
        System.out.println("Danh sách sản phẩm : ");
        for (Product product : listProductLinkedList) {
            System.out.println(product);
        }
    }

    public static void editProductByIdLinkedList() {
        String id,name;
        int price;
        System.out.print("\nNhập vào id sản phẩm bạn muốn chỉnh sửa : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        System.out.print("Chỉnh sửa tên : ");
        name = scanner.nextLine();
        System.out.print("Chỉnh sửa giá : ");
        price = scanner.nextInt();
        Product editProduct = new Product(id,name,price);
        int n=0;
        for (Product product : listProductLinkedList) {
            if (product.getId().equals(id)) {
                n = listProductLinkedList.indexOf(product);
            }
        }
        listProductLinkedList.remove(n);
        listProductLinkedList.add(n,editProduct);
    }

    public static void deleteProductByIdLinkedList() {
        String id;
        System.out.print("Nhập vào id sản phẩm bạn muốn xóa : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        for (Product product : listProductLinkedList) {
            if (product.getId().equals(id)) {
                listProductLinkedList.remove(product);
            }
        }
    }

    public static void searchProductByNameLinkedList() {
        String name;
        System.out.print("Nhập vào tên sản phẩm bạn muốn tìm : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        for (Product product : listProductLinkedList) {
            if (product.getName().equals(name)) {
                System.out.println("Thông tin sản phẩm : "+product);
            }
        }
    }

    public static void sortDescendingByPriceLinkedList() {
        System.out.println("\nSắp xếp giảm dần sản phẩm theo giá : ");
        Collections.sort(listProductLinkedList,new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    public static void sortAscendingByPriceLinkedList() {
        System.out.println("\nSắp xếp tăng dần sản phẩm theo giá : ");
        Collections.sort(listProductLinkedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
