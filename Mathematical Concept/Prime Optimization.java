import java.lang.*;
class Main {
    public static void main(String[] args) {
        
        int num = 6;
        int sum = 0;
        
        for (int i = 2 ; i * i <= num;i++){
            if (num % i == 0){
                sum = sum + i;
                if (i != num/i){
                    sum = sum + (num/i);
                }
            }
        }
      if (num == 1){
          System.out.println("Not a Prime Number");
      }
      else if (sum == 0){
          System.out.println("Prime Number");
          
      }
      else {
          System.out.println("Not a Prime Number");
          
      }
    
    }
}

output:
not a prime number
