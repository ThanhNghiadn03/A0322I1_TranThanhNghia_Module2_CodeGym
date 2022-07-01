package ss10_dsa_list.ThucHanh.SimpleListClass;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(3);
        System.out.println("element 1 : "+ listInteger.get(1));
        listInteger.get(5);
        System.out.println("element 5 : "+ listInteger.get(5));
    }
}
