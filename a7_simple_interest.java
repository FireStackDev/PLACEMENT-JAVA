import java.util.Scanner;

public class a7_simple_interest {
    public static double simple_interest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",");

        System.out.print("Enter PRINCIPAL, RATE, TIME = ");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        System.out.println("Simple Interest = " + simple_interest(principal, rate, time));

        sc.close();
    }
}
