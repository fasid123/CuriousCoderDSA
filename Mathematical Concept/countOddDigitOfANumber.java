class Main {
    public static void main(String[] args) {
        int n = 123;
        int count = 0;
        while (n > 0){
           
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0){
                 count = count + 1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

output: 2
