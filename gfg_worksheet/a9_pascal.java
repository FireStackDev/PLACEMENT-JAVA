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
        
        int[] row = new int[n];

        row[0] = 1;

        for (int i = 0; i < n; i++) {
            // update from right to left
            for (int j = i; j > 0 ; j--) {
                row[j] = row[j] + row[j - 1];
            }

            // print space
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // print current row
            for (int j = 0; j <= i; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
        

        sc.close();
    }
}