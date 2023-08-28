package Medium;

/* https://leetcode.com/problems/divide-two-integers/ */

public class div_two {
    public static int divide(int dividend, int divisor) {
        int s;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        s=dividend/divisor;
        return s;
    }
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}
