package leetcode.array;

import java.util.Arrays;

//仅使用恒定的额外空间复杂度来实现
//给定一个物理空间了
public class missingNumber {
    public int missingNumber(int[] nums){

        int sum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
           sum -= nums[i];
        }
      return sum;
    }
}
