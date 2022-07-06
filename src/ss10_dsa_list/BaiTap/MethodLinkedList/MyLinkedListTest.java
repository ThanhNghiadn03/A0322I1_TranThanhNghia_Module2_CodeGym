package ss10_dsa_list.BaiTap.MethodLinkedList;

import java.util.Scanner;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(15);
        myLinkedList.addFirst(13);
        myLinkedList.add(2,4);
        myLinkedList.add(1,5);
        myLinkedList.addLast(19);
//        myLinkedList.deleteNode(5);
//        myLinkedList.remove(2);
        myLinkedList.printList();
        System.out.println("");
        System.out.printf("Nhập vào giá trị bạn muốn tìm : ");
        int element = 0 ;
        Scanner scanner = new Scanner(System.in);
        element = scanner.nextInt();
        if (myLinkedList.contains(element)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
