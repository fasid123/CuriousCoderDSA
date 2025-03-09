class Main {
    public static int lcm (int a, int b){
        
        // first find the max value of a and b 
        int max = a > b ? a : b;
        
        // Loop until we find the first number divisible by both a and b
        while (true){
            if ((max % a == 0) && (max % b == 0)){
                return max;
            }
            max ++;
        }
    }
    
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int val = lcm(a,b);
        System.out.println(val);
    }
}

output:
input 2 3
output : 6
