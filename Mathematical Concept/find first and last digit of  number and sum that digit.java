class FirstAndLastDigitAndSum {
    public static void main(String[] args) {
       int n=12;
       int temp = n;
       int fd = 0;
       if(n < 10) {
           // number less than 10 print whatever number it is
           System.out.println(n);
       }
       else {
           //first digit
        while(temp>0){
          int lds=temp%10;
          fd = lds;
          temp = temp/10;
       }
       
       //last digit 
       int ld = n%10;
       System.out.println(fd + ld);
       }
      
       
    }
}

condition if a number is less than 10 print whwtever value, else extract first and last digit of number

output 1 :

input : 1
ouput : 1

ouput 2:

input : 123
output: 4
