/* https://leetcode.com/problems/power-of-three/ */

public class pow_three {
    public boolean isPowerOfThree(int n) {
        int c=0;
        int n1=n;
        if (n==0 || n<0) {
            return false;
        }
        while(n1!=0) {
            n1=n1/3;
            c++;
        }
        if ((int)(Math.pow(3,c-1)) == n) {
            return true;
        }
        return false;
    }
}