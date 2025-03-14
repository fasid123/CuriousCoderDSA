Write a Program to find the power of a number recursively. Take two inputs, number and the power.

Example:
Input: 2 3
Output: 8
Explanation : 2^3 is 8

Example:
Input: 5 2
Output: 25
Explanation: 5^2 is 25

Code: 

class Main {
   
    public static int pow(int a, int i){
        if (i == 0){
            return 1;
        }
        return a * pow(a,i-1);
    }
    public static void main(String[] args) {
      
       int ok =  pow(5,2);
       System.out.println(ok);
    }
}

Output: 

25
