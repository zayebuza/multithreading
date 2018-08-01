package com.example.multithreading.threadPool;

import javafx.concurrent.Task;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/30 21:07
 */
public class MyThread implements Runnable {

    private int threadNum;

    public MyThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行task"+threadNum);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task"+threadNum+"执行完毕");
    }
}
