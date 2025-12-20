import java.util.*;
/*



*/
public class PatternAd2_PalindromePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5;
        int offset;

        for (int i = 0; i < size ; i++) {
            offset = (-1)*i;

            for (int j = 1; j < size - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i*2+1; j++) {
                System.out.print(Math.abs(offset)+1+" ");
                offset += 1;
            }
            System.out.println();
        }

        sc.close();
    }
}
