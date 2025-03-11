Search for a Number in a array : 
  
If number present print the index else not present display.

import java.util.*;

class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int searchValue = 5;
        int flag = -1;
        for (int i = 0; i< arr.length; i++){
            if (searchValue == arr[i]){
                flag = i;
            }
        }
        
        if (flag == -1){
            System.out.println("Not Present");
        }
        else {
            System.out.println(flag);
        }


    }
}

output : 4
