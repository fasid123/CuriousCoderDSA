class Main {
    public static void main(String[] args) {
        int num = 4;
        
        //upper part 
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
        
        
        //lower part
            for (int i = 1; i<= num; i++){
            
            // space
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            
            //stars
            for (int k = 1; k <= (2*num)-(2*i+1);k++){
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
  * * * * * 
    * * * 
      * 
        
