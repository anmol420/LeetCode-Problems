/* https://leetcode.com/problems/two-sum/ */

class palindrome {
    public static int Digits(int x) {
        int c=0,d=0;
        while (x!=0) {
            d=x%10;
            c++;
            x/=10;
        }
        return c;
    }
    public boolean isPalindrome(int x) {
        int y=Digits(x);
        y--;
        int x1=x;
        int sum=0,n1=0,d=0;
        if (x1<0) {
            return false;
        }
        while (y>=0) {
            d=x1/(int)(Math.pow(10,y));
            x1=x1%(int)(Math.pow(10,y));
            y--;
            sum=sum+(int)(d*Math.pow(10,n1));
            n1++;
        }
        if (sum==x) {
            return true;
        }
        return false;
    }
}