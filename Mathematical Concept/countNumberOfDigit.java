//count number of digit

class Main {
    public static void main(String[] args) {
        int n = 122;
        int count = 0;
        while (n > 0){
            count = count + 1;
            int lastDigit = n % 10;
            n = n/10;
        }
        System.out.println(count);
    }
}

output: 3 
