
Code :
import java.util.*;

class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int key = 4;
        int ok =0 ;
        for (int i = 0 ; i < arr.length;i++){
            if (i == key){
                ok = arr[i];
                break;
            }
        }
        System.out.println(ok);



    }
}

Output : 5 
