Write a program to print the divisors of a number recursively.

Example:
Input: 6
Output: 1 2 3 6
Example:
Input: 12
Output: 1 2 3 4 6 12

Code: 

import java.util.*;

class Main {
   
    public static void fun(int a, int i){
     
       
       if ( i > a ){  // base condition
          return;
       }
       
       if (a % i == 0){
           System.out.print(i+" ");
       }
           fun(a,i+1);
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int b = scan.nextInt();
       fun(b,1);
    }
}

Output:

Input : 12
Output: 1 2 3 4 6 12 
