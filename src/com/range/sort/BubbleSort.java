package com.range.sort;

public class BubbleSort {
//    最坏情况即每次都要交换哦O(n2)
//    最好情况即不用交换O(n)


    //    每次从尾到头遍历，俩俩对比，将小的放在前面
    int array[] = {7, 4, 5, 3, 2, 0};

    public static void bubbleSort(int array[]) {
        //用来识别是否发生了交换，没发生交换则完成排序
        boolean flag;
        for (int i = 0; i < array.length; i++) {
            flag = false;
//            从后面开始对比
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = array[j - 1];
                    flag=true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }
}
