Find the 3rd largest element in the array: 

Using sorting : efficient method: 

Code: 

class Main {
    public static void main(String[] args) {

        int [] arr = {9,1,2,6,7,0};
        // Your code here
        int n = arr.length;
        int k = 0;
         
         if (arr.length < 2){
            System.out.println(-1);
        }
        
        else {
        // bubble sort
        for (int i = 0; i < n-1;i++){
            k = k + 1;
            for (int j = 0; j < n-1;j++){ // inner for loop
                if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
                
            }
            if (k == 3){
                break;
            }
        } // outer for loop
        System.out.println(arr[n-3]);
        }
}

}

Output: 

6
