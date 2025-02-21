class Main {
    public static void main(String[] args) {
        int num = 105654;
        while(num > 0){
            int lastDigit = num % 10;
            System.out.println(lastDigit);
            num = num/10;
        }
    }
}


input is 105654

output is 
4
5
6
5
0
1
