Given two numbers A and B, find Kth digit from right of AB.
 

Example 1:

Input:
A = 3
B = 3
K = 1
Output:
7
Explanation:
33 = 27 and 1st
digit from right is 
7

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


input 1 is 81  k = 2
output: 8

input 2 is 0 k = 2
output : 0
