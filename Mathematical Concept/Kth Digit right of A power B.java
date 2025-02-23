class KthDigitrightofApowerB {
    public static void main(String[] args) {
       int a = 7;
       int b = 2;
       int k = 2;
       
       long power=(long)Math.pow(a,b);
       
       int count = 0;
       // find the kth digit of the right of the number
       if(power == 0){
            System.out.println("0");
        }
        else{
            while(power > 0){
           count = count + 1;
           long ld = power % 10;
           if(count == k){
               System.out.println(ld);
           }
           power = power/10;
       }
        }
     
    }
}

condition is if value is 0 then return 0 else do the kth digit value process.


input is 81  k = 2
output: 8
