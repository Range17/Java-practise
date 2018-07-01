package leetcode.array;

import java.util.Arrays;

public class majorityElement {
    public int majorityElement(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }

}
