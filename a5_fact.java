import java.util.*;

public class a5_fact {
    public static int fact(int n){
        if ( n == 1 || n == 0) {
            return n;
        }

        return fact(n-1) * n;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println("factorial of "+a+" = "+fact(a));

        sc.close();
    }
}
