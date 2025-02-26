// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 121;
        int check = n;
        int rev = 0;
        
        //reverse a number
        while ( n > 0){
          rev = rev * 10 +  n % 10; // use to mltiplies value 1 * 10 = 10 , 10 * 10 = 100
            n = n/10;
        }
        
        // check reverse and given input for a number is palindrome or not
        if (check == rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
        
        
    }
}

output:

palindorme
