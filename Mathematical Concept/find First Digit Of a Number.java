code 1 :

class DigitsOfNumber {
    public static void main(String[] args) {
       int n=63457;
       while(n>0){
          int ld=n%10;
          
          n=n/10;
          if (n == 0){
              System.out.println(ld);
          }
       }
    }
}

output: 6


code logic 2: dry run it . gud logic

class DigitsOfNumber {
    public static void main(String[] args) {
       int n=63457;
       while(n>0){
          int ld=n%10;
          if (n == ld){
              System.out.println(ld);
          }
          n=n/10;
          
       }
    }
}

output: 6

  
