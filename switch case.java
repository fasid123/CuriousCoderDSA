Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small

  
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
       switch(num) {
           case 29:
               System.out.println("Small");
               break;
            case 30:
               System.out.println("Medium");
               break;
            case 38:
               System.out.println("Large");
               break;
            case 42:
               System.out.println("XL");
               break;
            default:
                System.out.println("Invalid");
                break;
              
       }
        
    }
}
