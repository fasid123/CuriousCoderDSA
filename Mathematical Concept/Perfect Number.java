Perfect Number:
No of divisor is equal to the number  is called perfect number.

Condition : not consider the actual number

Eg : 9 

9 divisor is 1 3 9 but not add the 9 . only 1 , 3

  

code:
import java.lang.*;
class Main {
    public static void main(String[] args) {
        
        int num = 28;
        int sum = 1;
        
        for (int i = 2 ; i * i <= num;i++){
            if (num % i == 0){
                sum = sum + i;
                if (i != num/i){
                    sum = sum + (num/i);
                }
            }
        }
        if (num == sum){
            System.out.println("Perfect Number");
        }
        else{
             System.out.println("Not a Perfect Number");
        }
    
    }
}

output:
Perfect Number
