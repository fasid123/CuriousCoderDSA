import java.util.*;
class Main {
    public static void main(String[] args) {
        
    int a =10 ;
    int b = 20 ;
    int c = 15 ;
        // code here
        
        if ((a>b && a<c) || (a>c && a<b)){  // logic is check a is greather than b and a is lesser than c (or) a is greater than c and a is lesser than b
            System.out.println(a);
        }
        else if ((b>a && b < c) || (b > c && b < a)){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
         
    }
}

output:
input : 10 20 30
output : 20
