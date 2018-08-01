package com.example.multithreading.exercises.DeadLock1;

/**
 * @Author: miaodongbiao
 * @Date: 2018/8/1 19:16
 */
public class DeadLock implements Runnable {
    DeadLockService deadLockService = new DeadLockService();

    public DeadLock(DeadLockService deadLockService) {
        this.deadLockService = deadLockService;
    }

    @Override
    public void run() {
        deadLockService.leftRight();
    }
}
