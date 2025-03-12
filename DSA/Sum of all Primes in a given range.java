Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.
  
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int m = 15;
        int n = 25;
        int[] a = new int[n];  // once we initialize all index value = 0
        int sum = 0;
        // Sieve of Eratosthenes: Mark multiples of primes
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i] == 0) {  // If i is prime
                for (int j = i * 2; j < n; j += i) {
                    a[j] = 1;  // Mark multiples of i as non-prime
                }
            }
        }

        // Output all primes less than n
        System.out.println("Prime numbers less than " + n + ":");
        for (int i = m; i < n; i++) {
            if (a[i] == 0) {  // If a[i] is still 0, it's prime
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}


Input : L = 10, R = 20
Output : Sum = 60
Prime numbers between [10, 20] are:
11, 13, 17, 19
Therefore, sum = 11 + 13 + 17 + 19 = 60
Input : L = 15, R = 25
Output : Sum = 59
