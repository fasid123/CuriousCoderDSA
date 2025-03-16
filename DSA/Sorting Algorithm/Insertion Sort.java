
import java.util.*;

// insertion sort 

class Main {
    public static void main(String[] args) {
        int [] a = {1,3,6,2,4,0};
        int n = 6;
        
        for (int i = 1; i< n; i++){
            int key = a[i];
            int j = i-1;
            while( j >= 0 && key < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            
        }
        
        System.out.println(Arrays.toString(a));
        
    }
}

output: 
[0, 1, 2, 3, 4, 6]
