package com.example.multithreading.chapter1;

/**
 * Created by miaodongbiao
 * Date:2018/7/19-23:20
 * Description: 使用继承Thread的方式实现多线程
 *      1,需要手动重写run方法
 */
public class MyThreadExt extends Thread {
    @Override
    public void run() {
        int i = 0;
        i++;
        super.run();
        System.out.println("我是继承thread的方式实现多线程,"+"调用我的线程是："+Thread.currentThread().getName()+",i= "+i);
    }
}
