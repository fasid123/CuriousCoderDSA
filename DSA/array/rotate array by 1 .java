class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
       int n = arr.length-1;
        int temp = arr[n];
        
        for (int i = n; i >= 1; i--){
            arr[i] = arr[i-1];
            
        }
    arr[0] = temp;
       for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" ");
}

    }
}

output: 

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
