import java.util.*;

public class length_last {
    public static int lengthOfLastWord(String s) {
        StringTokenizer st=new StringTokenizer(s);
        String a[]=new String[st.countTokens()];
        int c=0;
        while (st.hasMoreTokens()) {
            a[c]=st.nextToken();
            c++;
        }

        System.out.println(a[c-1]);

        System.out.println();

        return a[c-1].length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}