package leetcode.array;

public class moveZeroes {
    public void moveZeroes(int[] nums){
        int zeroNum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroNum++;
            }else if(zeroNum != 0){
                nums[i-zeroNum] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
