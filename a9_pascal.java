/*
    0 : 1
    1 : 1 2 1
    2 : 1 2 3 2 1
    3 : 1 2 3 5 3 2 1

*/

import java.util.*;

public class a9_pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        
        int m, a, b, c;

        for (int i = 0; i < n; i++) {
            m = 2 * i + 1;

            for (int j = 0; j < m; j++) {
                a = 1;
                b = 2;
                c = a + b; 
                
                System.out.print(m+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
