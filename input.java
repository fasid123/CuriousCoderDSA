1. Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String word = scan.next();
        char letter = scan.next().charAt(0);
        System.out.println(num);
        System.out.println(word);
        System.out.println(letter);
    }
}
