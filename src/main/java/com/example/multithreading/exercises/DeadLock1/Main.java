package com.example.multithreading.exercises.DeadLock1;

/**
 * @Author: miaodongbiao
 * @Date: 2018/8/1 19:51
 */
public class Main {
    public static void main(String[] args) {
        DeadLockService deadLockService = new DeadLockService();
        DeadLock deadLock = new DeadLock(deadLockService);
        DeadLock2 deadLock2 = new DeadLock2(deadLockService);
        Thread thread = new Thread(deadLock);
        Thread thread1 = new Thread(deadLock2);
        thread.start();
        thread1.start();
    }
}
