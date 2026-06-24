class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyCircularQueue {

    private Node head;
    private Node tail;
    private int size;
    private int k;

    public MyCircularQueue(int k) {
        this.k = k;
        this.size = 0;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        Node node = new Node(value);
        if(isEmpty()){
            head = tail = node;
            tail.next = head;
        }else{
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;

        if(size == 1) {
            head = tail = null;
        }else{
            head = head.next;
            tail.next = head;
        }
        size --;
        
        return true;
    }
    
    public int Front() {
        
        return isEmpty() ? -1 : head.val;

        
    }
    
    public int Rear() {
        return isEmpty() ? -1 : tail.val;
        
    }
    
    public boolean isEmpty() {
        return size == 0;
        
    }
    
    public boolean isFull() {
        return size == k;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */