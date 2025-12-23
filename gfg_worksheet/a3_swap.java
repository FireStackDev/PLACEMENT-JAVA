import java.util.*;

public class a3_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();
        
        System.out.print("B = ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("A = "+a);
        System.out.print("B = "+b);


        sc.close();
    }    
}
