class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        
        while (b != 0) {
             int temp = b;
             b  = a % b;
             System.out.println(b);
             a = temp;
             System.out.println(a);
        }
       // System.out.println(a);
    }
}
