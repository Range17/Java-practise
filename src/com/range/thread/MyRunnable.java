package com.range.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 200; x++) {
            System.out.println(x);
        }
    }
}
