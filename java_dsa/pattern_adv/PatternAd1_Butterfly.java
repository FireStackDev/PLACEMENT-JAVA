import java.util.*;

/*
*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/

public class PatternAd1_Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5;

        List<StringBuilder> lines = new ArrayList<>();
        
        for (int i = 0; i < size ; i++) {
            StringBuilder line = new StringBuilder();
            
            for (int j = 0; j < size * 2; j++) {
                
                String item = "";

                // stars
                if ( j <= i && j < size || j >= size*2 - i - 1){
                    item = "* ";
                    System.out.print("* ");
                } 
                // space
                else if(j > i && j < size * 2 - i - 1) {
                    item = "  ";
                    System.out.print("  ");
                }

                line.append(item);
            }
            System.out.println();
            lines.add(line);
        }

        for(int i = lines.size() - 1 ; i >= 0 ; i--){
            System.out.println(lines.get(i));
        }

        sc.close();
    }
}
