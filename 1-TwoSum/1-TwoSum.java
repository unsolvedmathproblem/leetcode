// Last updated: 10/11/2026, 9:24:41 AM
class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //if (target - nums[i] <= target) {
                for (int j = 0; j < nums.length; j++) {
                    int sum = nums[i] + nums[j];
                    if(sum == target && i != j){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            //}
        }
        return result;
    }
}