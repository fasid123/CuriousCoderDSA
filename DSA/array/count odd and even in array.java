Code : 

class Main {
    public static void main(String[] args) {
        int n = 5;
        int [] arr = {1,2,3,4,5};
        int even = 0;
        int odd = 0;
        for (int i=0; i< n;i++){
           if (arr[i] % 2 == 0){
               even = even + 1;
           }
           else {
               odd = odd + 1;
           }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
Output:
2
3
