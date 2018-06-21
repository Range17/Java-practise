package leetcode.array;

import java.util.HashSet;

public class containDuplicate {
    public boolean containDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                return true;
            }else{
                hashSet.add(nums[i]);
            }
        }
        return false;
    }
}
