Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2.
Examples :
Input : arr1 = [5, 7, 9, 3, 6, 2],  arr2 = [1, 2, 6, 1, 9]
Output : 9
Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.

Input : arr1 = [0, 0, 0, 0],  arr2 = [1, 1, 2]
Output : 0

import java.util.*;

class Main {
    public static void main(String[] args) {
        // code here
    int [] arr1 = {1,2,3,4,5};
    int [] arr2 = {1,2,3};
        int max = arr1[0];
        int min = arr2[0];
        
        for (int i = 1; i < arr1.length;i++){
            if (max < arr1[i]){
                max = arr1[i];
            }
        }
        
        for (int j = 1; j< arr2.length;j++){
            if (min > arr2[j]){
                min = arr2[j];
            }
        }
        System.out.println(max * min);
    }
}

output : 5
