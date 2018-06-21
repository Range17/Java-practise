package leetcode.array;

import java.sql.Array;
import java.util.Arrays;

public class findContentChildren {

//    贪心算法当前最优解，不管后面的
    public int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}
