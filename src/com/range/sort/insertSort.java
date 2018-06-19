package com.range.sort;

public class insertSort {

    int array[]={7,5,6,4,9,2,3,1};

//    以数组中第一个为基准，每次将后面的数据插入
    public static void insertSort(int array[]){
        if(array==null||array.length<2){
            return;
        }
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            while(j>=0&&temp<array[j]){
                array[j+1]=array[j];
//                这一步是接着处理前面已经排序好的数据
                j--;
            }
//            此时已经跳出while循环，所以此时的array[j+1]就是排序好等待插入的地方
            array[j+1]=temp;
        }
    }
}

