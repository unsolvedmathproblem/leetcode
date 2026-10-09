// Last updated: 10/9/2026, 3:40:44 PM
public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                break;
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }
}