package com.example.multithreading.exercises.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/30 21:53
 * 打印数字
 */
public class ThreadB extends Thread {

    private Condition condition;
    private char [] chars;
    private int count;
    private Lock lock;
    public ThreadB(Condition condition,char[] chars,int count,Lock lock) {
    this.lock = lock;
        this.condition = condition;
        this.chars = chars;
        this.count = count;
    }

    @Override
    public void run() {
        for (char num : chars) {
            if (count == 1){
                System.out.println("字母线程上锁");
                lock.lock();
                count = 0;
                System.out.println("字母线程唤醒数字线程");
                condition.signal();
                try {
                    System.out.println("字母线程进入等待队列");
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("字母线程释放锁");
                    lock.unlock();
                }

            }
            count++;
            System.out.print(num);
        }
//        lock.lock();
//        condition.signal();
//        lock.unlock();
    }
}
