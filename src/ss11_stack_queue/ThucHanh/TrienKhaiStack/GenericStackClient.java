package ss11_stack_queue.ThucHanh.TrienKhaiStack;

public class GenericStackClient {
    public static void main(String[] args) {
//        GenericStackClient.stackOfStrings();
        GenericStackClient.stackOfInteger();
    }
    public static void stackOfStrings() {
        MyGenericStack<String> stackString = new MyGenericStack<>();
        stackString.push("a");
        stackString.push("b");
        stackString.push("c");
        stackString.printList();
        System.out.println("");
        stackString.pop();
        stackString.printList();
    }

    public static void stackOfInteger() {
        MyGenericStack<Integer> stackInteger = new MyGenericStack<>();
//        stackInteger.pop();
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(3);
        stackInteger.push(4);
        stackInteger.printList();
        System.out.println("");
        stackInteger.pop();
        stackInteger.pop();
        stackInteger.printList();
    }
}
