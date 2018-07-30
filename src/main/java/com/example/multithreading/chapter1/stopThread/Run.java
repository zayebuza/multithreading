package com.example.multithreading.chapter1.stopThread;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/28 16:08
 *
 * 使用thread.interrupt对线程做标记，标记为停止状态。  线程在执行的时候根据thread.isInterrupted的状态判断是停止状态的话，就抛异常停止线程
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

    }
}
