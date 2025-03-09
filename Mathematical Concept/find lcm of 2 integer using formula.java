lcm formula =  (a * b) / gcd of ( a,b )
------------------------------------------------
    
import java.util.Scanner;

public class LCMCalculator {

    // Function to find GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        // Calculate and print LCM
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm(n1, n2));
    }
}


output: 
input : 2 3 
output : 6
