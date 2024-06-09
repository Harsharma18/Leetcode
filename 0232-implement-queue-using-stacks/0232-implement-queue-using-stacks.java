class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue() {
        queue = new int[10]; // Initialize the queue with a capacity of 10
        front = 0;
        rear = 0;
        size = 0;
    }

    public void push(int x) {
        if (size == queue.length) {
            // Resize the queue if it's full
            int[] newQueue = new int[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(front + i) % queue.length];
            }
            queue = newQueue;
            front = 0;
            rear = size;
        }
        queue[rear] = x;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return element;
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public boolean empty() {
        return size == 0;
    }
}
