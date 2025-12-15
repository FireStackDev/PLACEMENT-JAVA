import java.util.Scanner;

public class a15_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",|\\s+");

        System.out.println("n = ");
        int n = sc.nextInt();
        

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}