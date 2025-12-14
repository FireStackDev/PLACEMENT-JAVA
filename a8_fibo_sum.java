import java.util.Scanner;

public class a8_fibo_sum {
    public static int fibo_sum(int n) {
        int sum = 0;
        int a = 0, b = 1, c;

        for (int i = 0; i < n; i++) {
            if ( i <= 1){
                c = i;
            } else {
                c = a + b;
            }

            System.out.println(c);

            sum = sum + c;
            a = b;
            b = c;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms = ");
        int n = sc.nextInt();

        System.out.println(fibo_sum(n));

        sc.close();

    }
}
