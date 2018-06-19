package com.range.thread;


//继承Thread重写run方法
public class MyThread extends Thread{
    @Override
//    仅仅是封装被线程执行的代码，直接调用是普通方法
    public void run(){
        for(int x=0;x<200;x++){
            System.out.println(x);
        }
    }
}
