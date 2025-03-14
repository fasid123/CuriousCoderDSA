Write a recursive program to find the sum of digits of a number.

Code : 

class Main {
    int count = 0;
    public static int val(int n){
        // base condition
         if (n%10 == n){
            return n;
         }
         // recursive statement
        
         return n%10 + val(n/10);
         
        
    }
    public static void main(String[] args) {
       System.out.println(val(34534)); 
    }
}
Output: 19

Explain : 3+4+5+3+4 = 19.
