import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 5;
        int [] arr = {1,2,3,4,5};
        
        for (int i=0; i< n;i++){
            arr[i] = arr[i] + 5;
        }
        System.out.println(Arrays.toString(arr));
    }
}

output:
[6, 7, 8, 9, 10]
