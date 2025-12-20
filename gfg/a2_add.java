import java.util.*;

public class a2_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number A =  ");
        int a = sc.nextInt();
        
        System.out.print("Enter Number B =  ");
        int b = sc.nextInt();

        int c = a + b; 

        System.out.println("a + b = " + c);
        
        sc.close();
    }
    
}
