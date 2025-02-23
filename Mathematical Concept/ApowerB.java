class ApowerB {
    public static void main(String[] args) {
       int a = 2;
       int b = 3;
       
       int result =  a;
       for (int i = 1; i< b;i++){
           result = result * a;
       }
       System.out.println(result);
    }
}

output: 
8

using built in pow  - pow is a built-in function

  Math.pow(a,b)- returns double value so we convert into long
  
class ApowerB {
    public static void main(String[] args) {
       int a = 2;
       int b = 3;
       
       long power=(long)Math.pow(a,b);
       System.out.println(power);
    }
}

output: 
8
