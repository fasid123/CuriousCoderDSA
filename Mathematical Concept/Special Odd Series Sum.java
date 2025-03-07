Given the value of n, we need to find the sum of the series where i-th term is sum of first i odd natural numbers.
NOTE: Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))
Example 1:
Input: n = 2
Output: 5 
Explanation: 1 + (1+3) = 5
Hence sum of the series is 5.


Example 2:
Input: n = 5
Output: 55
Explanation: 1 + (1+3) + (1+3+5) +
(1+3+5+7) + (1+3+5+7+9) = 55.
Hence sum of the series is 55.

Code:

class Solution {
    static long sumOfTheSeries(long n){
        // code here
        int sum = 0, oddTerm = 0;
        for (int i = 1 ; i<= 2*n-1 ; i= i+2){
            sum = sum + i;
            oddTerm = oddTerm + sum;
        }
        return oddTerm;
    }
}


Output: 
Input : 5
Output : 55
