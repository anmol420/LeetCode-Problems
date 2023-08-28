/* https://leetcode.com/problems/palindrome-number/ */

class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int x=0;
        int b[]=new int[2];
        for (int i=0;i<n;i++) {
            x++;
            if (x==n) {
                break;
            }
            if (nums[i]+nums[x] == target) {
                b[0]=i;
                b[1]=x;
            } else {
                for (int j=0;j<n;j++) {
                     if (nums[i]+nums[j] == target && i!=j) {
                        b[0]=i;
                        b[1]=j;
                    }
                }
            }
        }
        return b;
    }
}