package com.range.sort;

public class selectSort {
    int a[]={7,4,3,2,9,5,8};

    public void selectSort(int a[]){
        for(int i=0;i<a.length;i++){
//            在嵌套循环中每轮循环首先找到最小的，将最小的前面后继续寻找最小的
            int k=i;
//            首先找到最小的元素
            for(int j=i+1;j<a.length;j++){
                if(a[k]>a[j]){
                    k=j;
                }
            }
//            将最小的换到前面
            if(k!=i){
                int temp=a[k];
                a[k]=a[i];
                a[i]=temp;
            }
        }
    }
}
