Alternates in a array  using array list 


Print only alternates values in an array.
Code : 
import java.util.*;

class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        ArrayList<Integer> result = new ArrayList<>();
       
        for (int i = 0; i< arr.length;i = i+ 2){
            result.add(arr[i]);
        }
        System.out.println(result);


    }
}

Output : [1, 3, 5]
