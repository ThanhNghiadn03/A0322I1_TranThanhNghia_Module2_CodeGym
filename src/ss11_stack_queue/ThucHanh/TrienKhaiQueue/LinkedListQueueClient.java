package ss11_stack_queue.ThucHanh.TrienKhaiQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(6);
        queue.enqueue(8);
        System.out.println(queue.getSize());
        System.out.println("");
        queue.printList();
        System.out.println("\n");
        queue.dequeue();
        queue.dequeue();
        queue.printList();
    }

}
