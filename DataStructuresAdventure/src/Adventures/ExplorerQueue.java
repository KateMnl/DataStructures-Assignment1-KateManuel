package Adventures;

public class ExplorerQueue {

    private String[] queue;
    private int front, rear, size, capacity;

    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(String explorer) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add explorer: " + explorer);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = explorer;
        size++;
        System.out.println("Explorer " + explorer + " added to the queue.");
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No explorer to dequeue.");
            return null;
        }
        String explorer = queue[front];
        front = (front + 1) % capacity; // Circular increment of front index
        size--;
        System.out.println("Explorer " + explorer + " has entered the temple.");
        return explorer;
    }

    public String nextExplorer() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No explorers in line.");
            return null;
        }
        System.out.println("Next explorer in line: " + queue[front]);
        return queue[front];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current explorers in queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ExplorerQueue explorerQueue = new ExplorerQueue(5);

        explorerQueue.enqueue("Indiana Jones");
        explorerQueue.enqueue("Lara Croft");
        explorerQueue.enqueue("Nathan Drake");
        explorerQueue.enqueue("Rick O'Connell");
        explorerQueue.nextExplorer();
        explorerQueue.displayQueue(); 
        explorerQueue.dequeue();
        explorerQueue.dequeue();
        explorerQueue.displayQueue(); 
        explorerQueue.enqueue("Jack Sparrow");
        explorerQueue.enqueue("Tomb Raider");
        explorerQueue.displayQueue();
        explorerQueue.enqueue("Indiana Jones");
    }
}
