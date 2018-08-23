package leetcode.array;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public MyQueue(){

    }

    public void push(int x){
       s1.push(x);
    }

    public int pop(){
        if(s2.size() == 0){
            int n = s1.size();
            for(int i = 0;i<n;i++){
                s2.push(s1.pop());
            }
        }
        return  s2.pop();
    }

    public int peek(){
        if(s2.size() == 0){
            int n = s1.size();
            for(int i = 0;i<n;i++){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty(){
        return s1.size() == 0&&s2.size() == 0;
    }
}
