package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class happyNum {
    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1){
            int sum=0;
            while(n>0){
                sum+=(n%10)*(n%10);
                n=n/10;
            }
            if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
            }
            n=sum;
        }
        return true;
    }
}
