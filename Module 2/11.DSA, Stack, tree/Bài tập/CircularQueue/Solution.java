package CircularQueue;

public class Solution {
    public static void main(String[] args) {
        // Create a queue and initialize front and rear
        Queue queue = new Queue();
        // Inserting elements in Circular Queue
        queue.enQueue(24);
        queue.enQueue(94);
        queue.enQueue(6);
        queue.enQueue(18);
        queue.enQueue(20);
        queue.enQueue(19);
        queue.enQueue(11);

        // Display elements present in Circular Queue
        queue.displayQueue();

        // Deleting elements from Circular Queue
        System.out.println("Deleted value = " +  queue.deQueue());
        System.out.println("Deleted value = " +  queue.deQueue());

        // Remaining elements in Circular Queue
        queue.displayQueue();

        queue.enQueue(1);
        queue.enQueue(92);
        queue.displayQueue();
    }
}
