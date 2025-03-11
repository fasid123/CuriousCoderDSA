import java.util.*;

class Main {
    public static void main(String[] args) {
       
       int [] a = {1,2,5,8,0};
       int large = a[0];
       for (int i = 1; i< a.length;i++){
           if (large < a[i] ){
               large = a[i];
           }
       }
       System.out.println(large);
    }
}

Output : 
8
