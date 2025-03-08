Consider a sample space consisting of all perfect squares starting from 1, 4, 9 and so on. 
You are given a number n, you have to find the number of integers less than n in the sample space.

Input: n = 9
Output: 2
Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.
  
Input: n = 3
Output: 1
Explanation: 1 is the only Perfect Square less than 3. So, the Output is 1.

  import java.lang.*;
class Main {
    public static void main(String[] args) {
        
        int n = 36;
        int count = 0;
        for (int i = 1; i*i < n; i++) {
            count++;
        }
        System.out.println(count);
    
    }
}

output : 5
