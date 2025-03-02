import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i<= n; i++){
            if (n % i == 0){
                if (i % 3 == 0){
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}

Output:

input: n = 6
Output: 2
Explanation: 1, 2, 3, 6 are divisors of 6 out of which 3 and 6 are divisible by 3.
Input: n = 10
Output: 0
Explanation: 1, 2, 5 and 10 are divisors of 10 but none of them are divisible by 3
