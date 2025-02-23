class KthDigit right of A power B {
    public static void main(String[] args) {
       int a = 9;
       int b = 2;
       int k = 2;
       
       long power=(long)Math.pow(a,b);
       
       int count = 0;
       // find the kth digit of the right of the number
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


input is 81  k = 2
output: 8
