Write a program to check whether a triangle can be formed with the given values for the angles.
  
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sum = num1 + num2 + num3;
       
        if (sum == 180) {
            System.out.println("Triangle can formed");
        }
        else {
            System.out.println("Triangle can't formed");
        }
    }
}
