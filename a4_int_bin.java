import java.util.*;

public class a4_int_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A (int) = ");
        int a = sc.nextInt();
        int rem; 

        boolean odd = a % 2 == 0 ? false : true;
        
        int res = odd ? 0 : 1;

        while(a > 0){
            rem = a % 2;
            a = a / 2;
            
            System.out.println(rem);
            res = (res * 10) + rem;
        }

        res = odd ? res : res - 1;


        System.out.println(res);

        sc.close();
    }
}
