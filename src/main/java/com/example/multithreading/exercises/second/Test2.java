package com.example.multithreading.exercises.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/30 21:52
 *
 *     当多个线程需要协同完成一件事时，可以加锁+wait，notify一起完成。
 *
 * 　　1.写两个线程，一个线程打印1~52，另一个线程打印A~Z，打印顺序是12A34B...5152Z
 *
 *
 *
 */
public class Test2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        char[] chars = { 'a', 'b', 'c', 'd', 'e' };

        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        int count = 0;
        ThreadA threadA = new ThreadA(condition,nums,count,lock);
        threadA.start();
        ThreadB threadB = new ThreadB(condition,chars,count,lock);
        threadB.start();
    }

}
