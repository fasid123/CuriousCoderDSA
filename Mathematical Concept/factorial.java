import java.util.*;
class Main {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

output:
input : 5
output : 120
