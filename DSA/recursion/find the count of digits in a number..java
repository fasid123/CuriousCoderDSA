Write a recursive algorithm to find the count of digits in a number.

Example:
Input: 353445
Outpput: 6
Example 2 :
Input: 53543
Output: 5

Code : 

class Main {
    int count = 0;
    public static int val(int n){
        // base condition
         if (n%10 == n){
            return 1;
         }
         // recursive statement
        
         return 1 + val(n/10);
         
        
    }
    public static void main(String[] args) {
       System.out.println(val(345)); 
    }
}
Output: 3
