// Online Java Compiler
// Use this editor to write, compile and run your Java code online

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
        if ((rear +1) % size == front ){ // check full 
            System.out.println("enqueue is full");
        }
        else if (front == -1 && rear == -1){ // first element insert
            front = 0;
            rear = 0;
            arr[rear] = val;
        }
        else{
            rear = (rear + 1) % size;
            arr[rear] = val;
        }
    }
    
    public int dequeue(){
        if (rear == -1 && front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        else if (front == rear){ // means one element left
            int item = arr[front];
            front = -1;
            rear = -1;
            return item;
        }
        else {
            int item = arr[front];
            front = (front + 1) % size; //bcse circular queue
            // above front only diff is when front = 4 it goes to 0 not 5 - implmenet circular queue
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
        int temp = front;
        if (rear == -1 && front == -1){
            System.out.println("Queue is empty");
           
        }
        else {
            while (temp != rear){
                System.out.println(arr[temp]);
                temp = (temp + 1) % size;
            }
            System.out.print(arr[rear]); //print last value
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.display();
        queue.enqueue(10);
       
       
        System.out.println(queue.peek());
       
        
       
        
        queue.peek();
    }
}


output:

8
8
8
8
10
enqueue is full
8

  we can use unused space also using circular queue
