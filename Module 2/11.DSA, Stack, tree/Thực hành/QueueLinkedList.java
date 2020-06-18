package Queue;

public class QueueLinkedList {
    private Node head;
    private Node tail;

    public QueueLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp; //them phan tu
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
            Node temp = this.head;
            this.head = this.head.next.next.next;
            if (this.head == null){
                this.tail = null;
        }
        return temp; // xoa phan tu
    }

    public static class Client {
        public static void main(String[] args) {
            QueueLinkedList queue = new QueueLinkedList();
            queue.enqueue(24);
            queue.enqueue(18);
            queue.enqueue(10);
            queue.enqueue(94);
            queue.enqueue(6);
            queue.enqueue(11);
            queue.dequeue();


            System.out.println("Queued items is: " + queue.dequeue().key);
        }
    }
}

