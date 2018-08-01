package com.example.multithreading.exercises.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/30 21:52
 * 打印字母
 */
public class ThreadA extends Thread {

    private Condition condition;
    private int [] nums;
    private int count;
    private Lock lock;
    public ThreadA(Condition condition,int[] nums,int count,Lock lock) {
        this.lock = lock;
        this.condition = condition;
        this.nums = nums;
        this.count = count;
    }

    @Override
    public void run() {
        for (int num : nums) {
            if (count == 2){
                System.out.println("数字线程我要上锁了");
                lock.lock();
                count = 0;
                System.out.println("我要唤醒字母线程了");
                condition.signal();
                try {
                    System.out.println("数字线程进入等待队列");
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("数字线程放弃锁");
                    lock.unlock();
                }

            }
            count++;
            System.out.print(num);
        }
    }
}
