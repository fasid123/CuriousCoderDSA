How do we print 1 - n using recursion: 

CODE: 
class Main {
    public static void fun(int n){
        if (n == 0){
            return;
        }
        
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun(5);
    }
}

OUTPUT : 
1
2
3
4
5
