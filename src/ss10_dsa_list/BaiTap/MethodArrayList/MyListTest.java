package ss10_dsa_list.BaiTap.MethodArrayList;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arraylist = new MyList<Integer>();
        arraylist.add(3,4);
        arraylist.add(8,77);
        arraylist.add(11,99);
        arraylist.add(11,3);
        arraylist.add(16,6);
        arraylist.add(1,8);
        for(int i=0 ; i<arraylist.getCapacity() ; i++) {
            System.out.println("Element "+i+" : "+arraylist.get(i));
        }
        arraylist.remove(3);
        System.out.println("\n");
        for(int i=0 ; i<arraylist.getCapacity() ; i++) {
            System.out.println("Element "+i+" : "+arraylist.get(i));
        }
        System.out.printf("\n Bạn muốn tìm giá trị nào trong danh sách : ");
        int valueNeedFind = 0;
        Scanner scanner = new Scanner(System.in);
        valueNeedFind = scanner.nextInt();
        if (arraylist.contains(valueNeedFind)) {
            System.out.println("Giá trị đó có trong danh sách ở vị trí : "+arraylist.indexOf(valueNeedFind));
        } else {
            System.out.println("Giá trị đó không có trong danh sách");
        }
        arraylist.clear();
        for(int i=0 ; i<arraylist.getCapacity() ; i++) {
            System.out.println("Element "+i+" : "+arraylist.get(i));
        }
    }


}
