
Code 1 :
class Main {
    public static void main(String[] args) {
       
       int [] a = {1,2,5,8,0};
       int small = a[0];
       for (int i = 1; i< a.length;i++){
           if (small > a[i] ){
               small = a[i];
           }
       }
       System.out.println(small);
    }
}

Output : 0


Code 2: input from user 

import java.util.*;

class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       int [] a = new int[n];
       
       for (int i = 0; i< n ; i++){
           a[i] = sc.nextInt();
       }
       
       int small = a[0];
       for (int i = 1; i< a.length;i++){
           if (small > a[i] ){
               small = a[i];
           }
       }
       System.out.println(small);
    }
}

Code:

8
5 7 34 67 2 56 5 8
2


