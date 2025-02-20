Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.

code:
  import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String firstName = scan.next();
        String lastName = scan.next();
        String fullName = firstName + lastName;
        int x = scan.nextInt();
        
        
        for (int i = 1; i <= x; i++){
            System.out.println(fullName);
        }
        
    }
}
