FIBONACCI SERIES: 

0 1 1 2 3 5 8 13 21……….

Find the nth fibonacci number : index start from 0

  Code: 

class Main {
    public static int fib(int n){
        if (n == 1){
            return 1;
        }
        else if (n == 0){
            return 0;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
        
        
        
    }
    public static void main(String[] args) {
       System.out.println(fib(2)); 
    }
}
Output : 
5
