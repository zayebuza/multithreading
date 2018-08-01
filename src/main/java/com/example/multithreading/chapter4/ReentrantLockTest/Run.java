package com.example.multithreading.chapter4.ReentrantLockTest;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/31 12:37
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        MyThread myThread1= new MyThread(myService);


        myThread.start();
        myThread1.start();






    }
}
