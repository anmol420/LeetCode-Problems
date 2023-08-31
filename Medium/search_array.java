package Medium;

/* https://leetcode.com/problems/search-in-rotated-sorted-array */

public class search_array {
    public int search(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
