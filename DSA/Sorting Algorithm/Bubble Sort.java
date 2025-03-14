bubble sort 
code:

import java.util.*;

class Main {
    public static void main(String[] args) {
        int [] a = {1,5,8,20,2,6};
        int n = 6;
        
        for (int i = 0; i < n-1;i++){
            
            for (int j = 0; j < n-i-1; j++){
                
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            } //inner loop
            
           System.out.println(Arrays.toString(a));
        } //outer loop
       
    }
}

output:

[1, 5, 8, 2, 6, 20]
[1, 5, 2, 6, 8, 20]
[1, 2, 5, 6, 8, 20]
[1, 2, 5, 6, 8, 20]
[1, 2, 5, 6, 8, 20]
