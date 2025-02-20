Given mark of student, Print the Grade

Grade A if mark is greater than or equal to 90

Grade B if mark is greater than or equal to 80

Grade C if mark if greater than or equal to 60

Grade D if mark if greaer than or equal to 35

Fail if mark is lesser than 35

  
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
       
        if (num >= 90) {
            System.out.println("Grade A");
        }
        else if (num >= 80) {
            System.out.println("Grade B");
        }
        else if (num >= 60){
            System.out.println("Grade C");
        }
        else if (num >= 35){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
        
    }
}
