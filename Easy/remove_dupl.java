/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */

public class remove_dupl {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n - 1];
        return j;
    }
    public static void main(String[] args) {
        int a[]={1,1,2};
        System.out.println(removeDuplicates(a));
    }
}
