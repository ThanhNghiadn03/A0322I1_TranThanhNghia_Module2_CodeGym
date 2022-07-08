package ss11_stack_queue.ThucHanh.TrienKhaiStack;

import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(T element) {
        stack.addFirst(element);
    }
    public void pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Error");
        }
        stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        if (stack.size()==0) {
            return true;
        } else {
            return false;
        }
    }
    public void printList() {
        for (int i=0 ; i<stack.size() ; i++) {
            System.out.println(stack.get(i));
        }
    }
}
