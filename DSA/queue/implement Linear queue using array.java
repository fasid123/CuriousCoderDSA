class Queue {
    private int []arr;
    private int front;
    private int rear;
    private int size;
    Queue(int val){
        size = val;
        arr = new int[val];
        front = -1;
        rear = -1;
    }
    public void enqueue(int val){
        if (rear == size-1 ){ // check full 
            System.out.println("enqueue is full");
        }
        else if (front == -1 && rear == -1){ // first element insert
            front = 0;
            rear = 0;
            arr[rear] = val;
        }
        else{
            rear++;
            arr[rear] = val;
        }
    }
    
    public int dequeue(){
        if (rear == -1 && front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        else if (front == rear){ // means last element
            int item = arr[front];
            front = -1;
            rear = -1;
            return item;
        }
        else {
            int item = arr[front];
            front++;
            return item;
        }
    }
    
    public int peek(){
        if (rear == -1 && front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }
    public void display(){
        if (rear == -1 && front == -1){
            System.out.println("Queue is empty");
           
        }
        else {
            for (int i = front; i <= rear ; i++ ){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(9);
       
        System.out.println(queue.peek());
       
        
       
        
        queue.peek();
    }
}


Output:
8 9 10 
9 10 
10 
Queue is empty
8


  But drawback is eg n = 5

I insert 5 data then i delete 3 data it contains only 2 data in array, then i insert , code says queue is full 
Bcse rear = 4.
Wastage of space, we have 3 space in front but we cannot use that space.
