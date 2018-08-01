package com.example.multithreading.chapter4.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/31 12:33
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethos(){
        lock.lock();
        for (int i = 0;i<5;i++){
            System.out.println("ThreadName"+Thread.currentThread().getName()+("   "+(i+1)));
        }
        lock.unlock();
    }
}
