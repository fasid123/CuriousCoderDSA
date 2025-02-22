class Main {
    public static void main(String[] args) {
        int num = 25;
        int count = 1;
        
            for (int j = 1 ; j <= num; j++ ){
                System.out.print(" ".repeat(num-j));
                System.out.print("*".repeat(count));
                count = count + 2;
                System.out.println("");
                
            }

    }
}

output:

    *
   ***
  *****
 *******
*********
