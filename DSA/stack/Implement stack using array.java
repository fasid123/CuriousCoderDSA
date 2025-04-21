// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Stack {
    private int maxSize;
    private int []arr;
    private int top;
    
    Stack (int data){
        maxSize = data;
        arr = new int[data];
        top = -1;
        
    }
    public boolean isFull(){
        return top == maxSize-1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public void push(int data){
        if (isFull()){
            System.out.println("Stack is full"); // if full
            
        }
        else{
            top++;
            arr[top] = data;
            
        }
    }
    
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return arr[top--];
        }
    }
    
    public void display(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--){
                System.out.print(arr[i] + "-> ");
            }
            System.out.println();
            
        }
    }
    
    public int peak(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        Stack stack = new Stack(n);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        
        System.out.println("popped element " + stack.pop());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(3);
        stack.display();
        
        System.out.println("peak element " + stack.peak());
        
        
        
    }
}

OUTPUT: 

Stack elements (top to bottom): 
4-> 3-> 2-> 1-> 
popped element 4
Stack elements (top to bottom): 
3-> 
peak element 3
