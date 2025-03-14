Count zeros in a number using recursion: 

N = 203009

First break down into small chunks

First find the base condition    ( n % 10 == n ) 

Code: 

class Main {
    int count = 0;
    public static int val(int n){

        // base condition
         if (n%10 == n){
            if (n % 10 == 0){
                return 1;
            }
            else {
                return 0;
            }
         }

         // recursive statement
         if (n % 10 == 0) {
             return 1 + val(n/10);
         }
         else {
             return val(n/10);
         }
    }
    public static void main(String[] args) {
       System.out.println(val(2030090)); 
    }
}

Output : 
4
