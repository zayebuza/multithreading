package com.example.multithreading.chapter1;

/**
 * 2 * @Author: miaodongbiao
 * 3 * @Date: 2018/7/20 13:00
 * 4   测试Runnable线程可以共享实例变量
 */
public class MyThreadImpl2 implements Runnable {
    private int i ;
    @Override
    synchronized public void run() {
        i++;
        System.out.println("我是实现Runnable创建的线程,"+"调用我的线程是："+Thread.currentThread().getName()+"，实例变量 i = "+i);
    }
}
