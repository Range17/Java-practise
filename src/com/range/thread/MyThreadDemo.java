package com.range.thread;

public class MyThreadDemo {
    public static void main(String[] args){
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

//        start首先启动了线程，然后再由jvm调用该线程的run方法
        myThread1.start();
        myThread2.start();
    }
}
