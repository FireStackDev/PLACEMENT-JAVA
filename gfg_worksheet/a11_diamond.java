import java.util.Scanner;
// import java.util.*;

public class a11_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int size, offset;

        offset = (-1)*n;

        for (int i = 0; i <= n*2; i++) {
            size = n - Math.abs(offset);
            
            // space (high to low to high)
            for (int j = 0; j < Math.abs(offset); j++) {
                System.out.print(" ");
            }

            // digit (low to high to low)
            for (int j = 0; j < size*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();

            offset++;
        }


        sc.close();
    }
}
