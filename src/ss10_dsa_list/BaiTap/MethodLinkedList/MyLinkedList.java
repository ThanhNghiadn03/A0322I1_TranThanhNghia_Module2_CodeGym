package ss10_dsa_list.BaiTap.MethodLinkedList;

public class MyLinkedList <E>{
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add(int index , E element) {
        Node temp = head;
        Node holder;

        for (int i=0 ; i<index-1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        add(numNodes+1,element);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteNode(E key)
    {
        Node tmp = head;
        Node previous = null;
        if (tmp != null && tmp.data == key) {
            head = tmp.next;
            return;
        }
        while (tmp != null && tmp.data != key) {
            previous = tmp;
            tmp = tmp.next;
        }

        if (tmp==null) {
            return;
        }

        previous.next = tmp.next;

    }

    public void remove(int index) {
        Node temp = head;
        Node previous = null;
        int checkIndex = 0;
        while (temp != null && checkIndex != index) {
            previous = temp;
            temp = temp.next;
            checkIndex++;
        }
        if (temp == null) return;
        previous.next = temp.next;
    }

    public int getSize() {
        return numNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            previous = temp;
            temp = temp.next;
        }
        return (E) previous.data;
    }

    public E get(int index) {
        Node temp = head;
        for (int i=0 ; i<index ; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public MyLinkedList clone(){
        return this;
    }

}
