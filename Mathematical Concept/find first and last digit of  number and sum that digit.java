class FindFirstandLastDigitandSum {
    public static void main(String[] args) {
       int n=63457;
       int fd = 0;
       while(n>0){
          int lds=n%10;
          fd = lds;
          n=n/10;
       }
       
       //last digit 
       int ld = 63457%10;
       System.out.println(fd + ld);
    }
}

output: 
13
