import java.util.*;

public class a4_int_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A (int) = ");
        int a = sc.nextInt();
        int rem, res = 0; 

        while(a > 0){
            rem = a % 2;
            a = a / 2;
            
            System.out.println(rem);
            res = (res * 10) + rem;
        }

        System.out.println(res);

        sc.close();
    }
}
