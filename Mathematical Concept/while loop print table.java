import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int val = num* 10;
       while (val >= num){
           
           System.out.print(val +" ");
           val = val -num;
       }
        
    }
}

output:
Input: n = 1
Output: 10 9 8 7 6 5 4 3 2 1

Input: n = 2
Output: 20 18 16 14 12 10 8 6 4 2
