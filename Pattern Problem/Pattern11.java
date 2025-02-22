class Main {
    public static void main(String[] args) {
        int num = 25;
        int count = num*2-1;
        int zeroCount = 0;
        
            for (int j = 1 ; j <= num; j++ ){
                System.out.print(" ".repeat(zeroCount));
                zeroCount = zeroCount + 1;
                System.out.print("*".repeat(count));
                count = count - 2;
                System.out.println("");
                
            }

    }
}

