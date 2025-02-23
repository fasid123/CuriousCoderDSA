Nandy code : 
    
class Main {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 1 ; i<= num;i++){
            // space
            for (int k = 1; k <= num-i ; k++){
                System.out.print("  ");
            }
            
            // stars
            
             for (int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("* ");
            }
           
            System.out.println("");
        }
    }
}


output:

      * 
    * * * 
  * * * * * 
* * * * * * * 



my code : 

class Main {
    public static void main(String[] args) {
        int num = 25;
        int count = 1;
        
            for (int j = 1 ; j <= num; j++ ){
                System.out.print(" ".repeat(num-j));
                System.out.print("*".repeat(count));
                count = count + 2;
                System.out.println("");
                
            }

    }
}

output:

    *
   ***
  *****
 *******
*********
