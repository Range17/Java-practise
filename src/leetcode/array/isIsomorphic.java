package leetcode.array;

import java.util.HashMap;
//
//给定两个字符串 s 和 t，判断它们是否是同构的。
//如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
//所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。

public class isIsomorphic {
    public boolean isIsomorphic(String s,String t){

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> hashMapS = new HashMap<Character, Character>();
        HashMap<Character,Character> hashMapT = new HashMap<Character, Character>();

        for(int i=0;i<s.length();i++){
            if(hashMapS.containsKey(s.charAt(i))){
                if(hashMapS.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else{
                if(hashMapT.containsKey(t.charAt(i))){
                    return false;
                }
                hashMapS.put(s.charAt(i),t.charAt(i));
                hashMapT.put(t.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
