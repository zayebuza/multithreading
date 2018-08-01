package com.example.multithreading.exercises.DeadLock1;

/**
 * @Author: miaodongbiao
 * @Date: 2018/8/1 19:50
 */
public class DeadLock2 implements Runnable{
    DeadLockService deadLockService = new DeadLockService();

    public DeadLock2(DeadLockService deadLockService) {
        this.deadLockService = deadLockService;
    }

    @Override
    public void run() {
        deadLockService.rightLeft();
    }
}
