Nnandy code : 
    
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



my code:

class Main {
    public static void main(String[] args) {
        
        int n = 4;
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i ;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= n-1; i++){
            for (int j = n-i; j >= 1 ;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        
        
    }
}
