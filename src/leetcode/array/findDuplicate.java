package leetcode.array;

//题目中假设只有一个重复的数字
public class findDuplicate {
    public int findDuplicate(int[] nums) {
        int max = nums.length - 1;
        int min = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
