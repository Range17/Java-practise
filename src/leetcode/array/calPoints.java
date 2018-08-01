package leetcode.array;

import java.util.Stack;

public class calPoints {
    public int claPoints(String[] ops){
//        建立一个栈，将数据压入栈中，遇到特殊字符再弹出
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String op : ops){
            char ch = op.charAt(0);
//            判断是否为整型
            if(Character.isDigit(ch)||ch == '-'){
                stack.push(Integer.parseInt(op));
//                peek是查看栈顶元素而不取出元素
                result += stack.peek();
            }
//            最后一个获得的分数无效，将数据弹出
            if(ch == 'C'){
                result -= stack.pop();
            }
//            获得的分数为栈顶的2倍
            if(ch == 'D'){
                stack.push(stack.peek()*2);
                result += stack.peek();
            }

//            获得的分数为栈顶，栈顶下的第二个数据的综合
            if(ch == '+'){
                int temp = stack.pop();
                int sum = temp+stack.peek();
                stack.push(temp);
                stack.push(sum);
                result += sum;
            }
        }
        return result;
    }

}
