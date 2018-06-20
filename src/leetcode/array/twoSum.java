package leetcode.array;

import java.util.HashMap;
import java.util.Map;

//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
//你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
public class twoSum {

    public int[] twoSum(int[] nums,int target) {
        int[] result = new int[2];
        if(nums==null||nums.length<=1){
            return result;
        }
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int r = target-nums[i];
            if(hashMap.containsKey(r)&&hashMap.get(r)!=i){
                result[0]=i;
                result[1]=hashMap.get(r);
                break;
            }
        }

        return result;
    }
}
