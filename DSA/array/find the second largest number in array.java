Code: 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        int [] a = {1,22,4,5,55};
        
        int max1 = -1;
        
        for (int i = 0; i< a.length; i++){
            if (a[i] > max1){
                max1 = a[i];
            }
        }
        
        int max2 = -1;;
        
        for (int i = 0; i< a.length; i++){
            if (a[i] > max2 && a[i] != max1){
                max2 = a[i];
            }
        }
        
      
        System.out.println(max2);
    }
}


Output: 

22
