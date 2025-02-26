class ReverseNumber {
    public static void main(String[] args) {
       int n=123, rev = 0;
        while(n>0){
            int ld = n%10;
            rev = rev *10 + ld;  // this logic is for reverse a given number
            n=n/10;
        }
        System.out.println(rev);
    }
}

output: 321
