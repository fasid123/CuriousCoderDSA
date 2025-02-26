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
    for(int x=2;x<=n;x++){
        int flag = 0;
        for(int i=2;i<x;i++){
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

  
