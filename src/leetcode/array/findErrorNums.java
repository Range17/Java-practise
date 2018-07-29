package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class findErrorNums {
    public int[] findErrorNums(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;
        int[] result = new int[2];
        int now = 0;
        int expected = 0;
        for(int i=0;i<length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                result[0]=nums[i];
            }
            now += nums[i];
        }
        for(int i=1;i<=length;i++){
            expected+=i;
        }
        result[1]=(expected-now+result[0]);
        return result;
    }
}
