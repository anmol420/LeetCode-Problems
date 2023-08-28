package Medium;

/* https://leetcode.com/problems/powx-n/ */

class pown {
    public static double myPow(double x, int n) {
        double s=1;
        if (n>0) {
            s = Math.pow(x, n);
        } else if (n<0) {
            s=Math.pow(x,n);
        } else {
            s=1;
        }
        return s;
    }
}