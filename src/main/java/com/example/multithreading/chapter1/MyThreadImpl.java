package com.example.multithreading.chapter1;

/**
 * 2 * @Author: miaodongbiao
 * 3 * @Date: 2018/7/20 12:35
 * 4   实现Runnable的方式创建线程
 */
public class MyThreadImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("我是实现Runnable创建的线程,"+"调用我的线程是："+Thread.currentThread().getName());
    }
}
