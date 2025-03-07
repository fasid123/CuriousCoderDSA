Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Examples:

Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
  
Input: n = 7
Output: 784
Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784

  code:
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // code here
     
        // code here
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i*i*i;
        }
      System.out.println(sum);


    
};

    }

output:

input : 5
output : 225
