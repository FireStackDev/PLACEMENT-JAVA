import java.util.*;

public class StrBuild1_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello world");

        System.out.println(str);

        // charAt
        System.out.println(str.charAt(0));

        // set char (char)
        str.setCharAt(0, 'Y');
        System.out.println(str);
        
        // insert (char)
        str.insert(0, 'a');
        System.out.println(str);
        
        // delete (index range - inclusive, exclusive)
        str.delete(0,3);
        System.out.println(str);
        
        // appending (string)
        str.append(" java");
        System.out.println(str);
    }
}