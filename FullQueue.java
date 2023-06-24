class FullQueue {
        class Node 
        {
        public int data;
        public Node next;
        public Node(int data) 
        {
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    public FullQueue() {
        front = null;
        rear = null;
    }

    void enqueue(int value) {
        Node new_node = new Node(value);
        if (isEmpty()) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }

        System.out.println(value + "Enqueue");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(dequeuedValue + "Dequeue");
        return dequeuedValue;
    }
    boolean isEmpty() {
        if(front == null){
            return true;
            }
            else{
                return false;
            }
    }

    public static void main(String[] args) {
        FullQueue queue = new FullQueue();

        queue.enqueue(91);
        queue.enqueue(310);
        queue.enqueue(20);
        queue.enqueue(63);
        queue.enqueue(53);

        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }
}
