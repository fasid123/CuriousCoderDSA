class FactorSum {
    public static void main(String[] args) {
        int n = 16;
        long sum = 0;
        
        // Loop through numbers from 1 to sqrt(n)
        for (int i = 1; i * i <= n; i++) { 
            if (n % i == 0) { //10 % 1 == 0
                sum += i;  // Add divisor i 1
               
                // If i is not equal to n / i, add n / i as well
                if (i != n / i) {// 1 !=  10/1
                    sum += n / i; // = 10/ 1 = 10
                }
            }
        }
        System.out.println(sum);  // Output the sum of divisors
    }
}

optimized approach 
input : 16
output : 31
