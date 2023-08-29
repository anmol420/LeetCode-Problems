/* https://leetcode.com/problems/valid-palindrome/description/ */

public class valid_palin {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String st="",rst="";
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);

            if ((ch>='a'&&ch<='z') || (ch>='0' && ch<='9')) {
                st=st+ch;
                rst=ch+rst;
            }
        }

        if (rst.equals(st)) {
            return true;
        } else {
            return false;
        }
    }
}
