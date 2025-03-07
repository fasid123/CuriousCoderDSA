Given the value of n, we need to find the sum of the series where i-th term is sum of first i natural numbers.
NOTE: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)

seriesterm

Example 1:
Input: n = 5
Output: 35 
Explanation: 1 + (1+2) + (1+2+3).. = 35
Hence sum of the series is 35.

Example 2:
Input: n = 10
Output: 220
Explanation: 1 + (1+2) + (1+2+3) +
(1+2+3+4) + (1+2+3+4+5)... = 220.
Hence sum of the series is 220.

Code:

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // code here
        int sum = 0; 
        int seriesTerm = 0;
        for (int i =1; i<= n; i++){
            sum = sum + i;
            seriesTerm = seriesTerm + sum;
        }
        System.out.println(seriesTerm);
    

    
};

    }

Output:
Input : 5
Output : 35
