import java.util.*;

public class StrBuild2_Pallindrome {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("hello world");

        for (int i = 0; i < text.length()/2 ; i++) {
            System.out.println(text.substring(i, i+1));

            int front = i;
            int back = text.length() - 1 - i;

            char front_char = text.charAt(front);
            char back_char = text.charAt(back);

            text.setCharAt(front, back_char);
            text.setCharAt(back, front_char);
        }

        System.out.println(text);
    }
}