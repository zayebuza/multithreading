package com.example.multithreading.chapter1;

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by miaodongbiao
 * Date:2018/7/19-23:20
 * Description:
 */
public class Main {
    public static void main(String[] args) {
     // testStart2();
        //testThreadImpl();
        testThreadImpl2();



    }


    /**
     * 同一线程连续调用多次start
     * 异常：java.lang.IllegalThreadStateException
     *  因为线程状态  详见md文件
     */
    public static void testStart2(){
        MyThreadExt myThreadExt = new MyThreadExt();
       Thread thread = new Thread(myThreadExt);
       thread.start();
        Thread thread2 = new Thread(myThreadExt);
        thread2.start();
        Thread thread3 = new Thread(myThreadExt);
        thread3.start();
    }

    /**
     * 实现Runnabel的方式的线程
     */
    public static void testThreadImpl(){
        MyThreadImpl myThread = new MyThreadImpl();
        Thread thread = new Thread(myThread);
        thread.start();
        Thread thread1 = new Thread(myThread);
        thread1.start();
        thread.stop();
    }

    /**
     * 测试Runnable线程可以共享实例变量
     *
     * 因为创建线程的时候使用的是同一个 实现Runnable接口的类。
     * 详细解读参照md文件
     * 这里存在问题就是，多个线程同时访问实例变量会存在问题，存在非线程安全的问题，非线程安全指的就是多个线程对同一个对象中的同一个实例变量就行操作时会出现值被更改，值不同步的情况
     *  解决方式： 在使用实例变量的方法上 加锁，synchronized
     *  通过在run方法上加入synchronized关键字，使多个线程在执行run方法时，以排队的方式进行处理。
     *  当一个线程调用run前，先判断run方法有没有被上锁，如果上锁了，说明有其他线程正在调用run方法
     *  必须等其他线程对run方法调用结束之后才可以，就可以去抢这把锁，抢到这把锁才可以调用run方法
     */
    public static void testThreadImpl2(){
        MyThreadImpl2 myThread = new MyThreadImpl2();
        for(int i = 0;i<100;i++){
            new Thread(myThread).start();


        }
    }


}
