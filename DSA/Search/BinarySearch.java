class Main {
    public static void main(String[] args) {
        int [] arr = {34,67,89,90,100,130,210};
        int x = 34;
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low + high) /2;
            if (arr[mid] == x){
                System.out.println(mid);
                break;
            }
            else if (arr[mid] > x){
                high = mid - 1;
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }
        }
    }
}

Output : 0

This above algo only works for no duplicate value in sorted array. If the duplicate value in array.
