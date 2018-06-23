package leetcode.array;

import java.util.Arrays;

public class singleNumber {
    public int singleNumber(int nums[]){
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i=i+2){
            if(i+1>=nums.length){
                return nums[i];
            }
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
