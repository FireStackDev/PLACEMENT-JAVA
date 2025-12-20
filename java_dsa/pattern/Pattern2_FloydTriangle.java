import java.util.Scanner;

public class Pattern2_FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("depth = ");
        int depth = sc.nextInt();
        int val = 1;

        for (int i = 0; i < depth ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val+" ");
                val += 1;
            }
            System.out.println();
        }

        sc.close();
    }
}
