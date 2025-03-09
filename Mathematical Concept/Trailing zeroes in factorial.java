Trailing zeroes in factorial

For an integer n, find the number of trailing zeroes in n!.

  Formula -> 
  trailing zeros: n/5 + n/25 + n/125 ................

Input: n = 5
Output: 1
Explanation: 5! = 120 so the number of trailing zero is 1.
Input: n = 4
Output: 0
Explanation: 4! = 24 so the number of trailing zero is 0.
Input: n = 43
Output: 9
  
Code : 
class Main {
    public static void main(String[] args) {
        int num = 43;
        int sum = 0;
        for (int i = 5; i <= num; i=i*5){
            sum = sum + (num/i);
        }
        System.out.println(sum);
    }
}

Output : 
Input : 43
Output : 9


