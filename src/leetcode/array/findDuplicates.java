package leetcode.array;

import java.util.ArrayList;
import java.util.List;

//三种方法
//https://blog.csdn.net/yutianzuijin/article/details/53861485


public class findDuplicates {
    public List<Integer> findDuplicates(int[] nums){
        List<Integer> result = new ArrayList<Integer>();
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }else{
                i+=1;
            }
        }
        int resultLength = 0;
        for(int j = 0; j<nums.length;j++){
            if(nums[j]!=j+1){
                result.add(Math.abs(nums[j]));
            }
        }
        return result;
    }
}
