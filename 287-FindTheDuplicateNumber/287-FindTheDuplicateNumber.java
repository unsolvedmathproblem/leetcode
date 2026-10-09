// Last updated: 10/9/2026, 3:40:42 PM

import java.util.Arrays;

class Solution {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int x = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                x = nums[i];
                count++;
                break;
            }
        }
        if(count > 0){
            return x;
        }
        return 0;
    }
}