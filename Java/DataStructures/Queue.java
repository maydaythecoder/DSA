import java.util.LinkedList;
import java.util.Queue;

class CustomQueue {
    private Queue<Integer> items;

    public CustomQueue() {
        this.items = new LinkedList<>();
    }

    // Enqueue element
    public void enqueue(int element) {
        items.add(element);
    }

    // Dequeue element
    public int dequeue() {
        if (items.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return items.poll();
    }

    // Get front element
    public int front() {
        if (items.isEmpty()) {
            System.out.println("No elements in Queue");
            return -1;
        }
        return items.peek();
    }

    // Print the queue
    public void printQueue() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue:");
        queue.printQueue();

        System.out.println("Front element: " + queue.front());

        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Queue after dequeue:");
        queue.printQueue();
    }
}
