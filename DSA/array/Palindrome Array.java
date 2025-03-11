import java.util.*;

class Main {
    public static void main(String[] args) {
        // code here
    int [] arr = {1,2,1};
       int [] arr2 = new int[arr.length];
       int  flag = 0;
         int ok = arr.length -1 ;
        for (int i = 0; i < arr.length;i++){
           
            arr2[i] = arr[ok];
            ok = ok-1;
    }
    
        for (int j = 0 ; j < arr.length; j++){
            if (arr[j] != arr2[j]){
                flag = -1;
                break;
            }
        }
        if ( flag == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

output : true
