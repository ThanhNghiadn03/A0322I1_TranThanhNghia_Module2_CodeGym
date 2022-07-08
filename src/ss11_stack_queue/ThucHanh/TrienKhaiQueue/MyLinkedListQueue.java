package ss11_stack_queue.ThucHanh.TrienKhaiQueue;


public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = temp;
            this.tail = temp;
            size++;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
        size++;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = temp.next;
        size--;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
    public int getSize() {
        return this.size;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.key);
            temp = temp.next;
        }
    }
}
