import java.util.Scanner;

public class a10_pyramid {
    /*
    
    0 : 1 - (0)
    1 : 3 - (-1)
    2 : 5 - (-2)

    */
    public static void pyramid(int n) {
        int offset, item;

        for (int i = 0; i < n; i++) {
            offset = (-1) * i;
            item = (i*2+1);

            // space
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }

            // digit
            for (int j = 0; j < item; j++) {
                if (offset < 0){
                    System.out.print(item + offset);
                } else {
                    System.out.print(item - offset);
                }
                System.out.print(" ");
                
                offset++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n = ");
        int a = sc.nextInt();
        
        pyramid(a);

        sc.close();
    }
}