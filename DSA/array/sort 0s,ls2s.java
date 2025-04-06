dutch flag algorithm:

import java.util.*;

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public static void main(String[] args) {
        // code here
        int [] arr = {0,1,2,0,1,2};
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (mid <= right){
            if (arr[mid] == 1){
                mid++;
            }
            
            else if (arr[mid] == 0){
                
                
                arr[mid] = arr[left]; // leftla ulla valuea mid ku maathu
                arr[left] = 0;  //lefta zero aagika
                
                mid++;
                left++;
            }
            else if ( arr[mid] == 2){
               arr[mid] = arr[right];
               arr[right] = 2;
              
               right--;
            }
        }
System.out.println(Arrays.toString(arr));
    }
}

Output: [0, 0, 1, 1, 2, 2]
