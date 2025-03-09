Getting input from user for array 

Code : 

import java.util.*;

class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int [] arr = new int[n];
    
    for (int i = 0; i< n ;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Input Over");    
    
    for (int i = 0 ; i< n; i++){
        System.out.println(arr[i]);
    }
    }
}

Output:

3
0
1
2
Input Over
0
1
2
