Find n-th term of series 1, 3, 6, 10, 15, 21:

Code:

Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…

Input: n = 4 
Output: 10
Explanation: The 4th term of the Series is 10.
Input: n = 3 
Output: 6
Explanation: The 3rd term of the Series is 6.


  code:
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    
};

    }

Output:
Input: 4
Output : 10
