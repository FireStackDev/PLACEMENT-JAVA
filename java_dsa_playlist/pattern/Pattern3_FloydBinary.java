import java.util.Scanner;

public class Pattern3_FloydBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("depth = ");
        int depth = sc.nextInt();

        for (int i = 0; i < depth ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i+j) % 2+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
