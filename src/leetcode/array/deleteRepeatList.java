package leetcode.array;


//给定一个排序数组，需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
//不使用额外的数组空间，必须在原地修改输入数组并使用O（1）额外空间的条件下完成
public class deleteRepeatList {
    public int removeDuplicates(int[] nums){
       if(nums==null||nums.length==0){
           return 0;
       }
//       使用快慢指针的形式
        int i;
        int j=0;
        for(i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
               }
        }
       return j+1;
    }
}
