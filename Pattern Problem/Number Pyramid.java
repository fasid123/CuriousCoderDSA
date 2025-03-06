public class NumberPyramid {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j);
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}

output:

      1
     232
    34543
   4567654
  567898765
 67891011109876
78910111213121110987
