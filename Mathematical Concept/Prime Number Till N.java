class Main {
    public static void main(String[] args) {
        int n = 10;
        int count;
       
       for (int i = 2; i <= n; i++){  
           count  = 0;
           for (int j = 1; j <= n ; j++){ 
               if ( i % j == 0) {
                    count = count + 1;
               }
           }
           if (count == 2){
               System.out.println(i);
           }
           
       }
       
    }
}

output :
  2
  3
  5
  7


alternate code :


  class PrimeNumbersTillN {
    public static void main(String[] args) {
       int n=10;
    for(int x=2;x<=n;x++){    //  untill 2 to 10  : first x = 2
        int flag = 0;         // whether flag is 0 : number is prime , else not a prime
        for(int i=2;i<x;i++){  // 2 to 2 : not go to condition so value is prime, 2 to 3 : go to condition 3 % 2, 2 to 4 : 
            if(x%i==0){
                flag = 1;
            }      
        }   
        if(flag==0){
            System.out.println(x);
        }
    }
    }
}

output :
  2
  3
  5
  7

  
