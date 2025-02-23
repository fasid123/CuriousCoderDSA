nandy code : 
    
class Main {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i<= n; i++){
            
            // star
            for (int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            
            for (int k = 1; k <= (2*n)-(2*i-1);k++){
                System.out.print("* ");
            }
            
            System.out.println("");
        }
        
    }
}

output:
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 



    

my code :


class Main {
    public static void main(String[] args) {
        int num = 25;
        int count = num*2-1;
        int zeroCount = 0;
        
            for (int j = 1 ; j <= num; j++ ){
                System.out.print(" ".repeat(zeroCount));
                zeroCount = zeroCount + 1;
                System.out.print("*".repeat(count));
                count = count - 2;
                System.out.println("");
                
            }


        output:
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 


    }
}

