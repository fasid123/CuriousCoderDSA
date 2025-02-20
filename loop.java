Write a program which takes two values x and y. Prints x for y number of times.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        for (int i = 1; i <= num2 ; i++){
            System.out.println(num1);
        }
        
       
        
    }
}
