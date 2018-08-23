package leetcode.array;

import java.util.HashMap;

public class findTheDifference {
    public char findTheDifference(String s,String t){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(hashMap.containsKey(ch1[i])){
                hashMap.put(ch1[i], hashMap.get(ch1[i])+1);
            }else{
                hashMap.put(ch1[i],1);
            }
        }

        for(int i =0;i<ch2.length;i++){
            if(hashMap.containsKey(ch2[i])){
                hashMap.put(ch2[i],hashMap.get(ch2[i])-1);
                if(hashMap.get(ch2[i])==0){
                    hashMap.remove(ch2[i]);
                }
            }else{
                return ch2[i];
            }
        }
        return 0;
    }
}
