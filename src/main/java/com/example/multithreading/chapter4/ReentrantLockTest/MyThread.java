package com.example.multithreading.chapter4.ReentrantLockTest;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/31 12:36
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethos();
    }
}
