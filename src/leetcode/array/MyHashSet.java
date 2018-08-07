package leetcode.array;

import java.util.HashMap;

public class MyHashSet {

    HashMap<Integer,Integer> map;
    public MyHashSet(){
        map = new HashMap<Integer, Integer>();
    }

    public void add(int key){
        map.put(key,1);
    }

    public void remove(int key){
        map.remove(key);
    }

    public boolean contains(int key){
        return map.containsKey(key);
    }



}
