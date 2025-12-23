import java.util.*;

public class a4_int_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A (int) = ");
        int a = sc.nextInt();

        int rem, res = 0, pos = 1; 

        while(a > 0){
            rem = a % 2;
            
            res = res + (rem * pos);
            
            a = a / 2;
            pos = pos * 10;
        }

        System.out.println(res);

        sc.close();
    }
}
