Reverse digits

You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.
Examples:
Input: 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.

Input : 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

Code:
import java.util.*;

class Main {
    public static void main(String[] args) {
        
      
        int n = 300;
      
        // Code here
        int rev = 0;
        while (n > 0){
            int ld = n % 10;
            
            rev = rev * 10 + ld;
            
            n = n/10;
        }
        System.out.println(rev);
};

Output 
Input: 002
Output : 2
