import java.util.*;

public class a14_arr_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",|\\s+");
        
        System.out.print("n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array = "+Arrays.toString(arr));

        int sum = 0;

        for (int x : arr) {
            sum += x;    
        }

        System.out.println("Sum = "+ sum);

        sc.close();
    }
}
