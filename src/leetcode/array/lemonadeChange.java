package leetcode.array;

import java.util.Stack;

public class lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
//        这道题采用栈的思想可以很好的解决
//        1.顾客给5块钱的话，直接入栈
//        2.顾客给10的话，如果栈顶是5则弹出，不然的话将数据弹到有5为止，不然返回false
//        3.顾客给20的话，弹出直到15

//        实际上不用使用压栈，只需要分别将其三个变量的值存起来就行了
//        每次输入再计算
        int money_5 = 0;
        int money_10 = 0;
        int money_20 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                money_5++;
            } else if (bills[i] == 10) {
                money_5--;
                money_10++;
                if (money_5 < 0) {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (money_10 > 0) {
                    money_10--;
                    money_5--;
                    if (money_5 < 0) {
                        return false;
                    }
                } else {
                    money_5 -= 3;
                    if (money_5 < 0) {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
