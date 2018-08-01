package com.example.multithreading.exercises.first;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/30 21:35
 * 启动3个线程打印递增的数字, 线程1先打印1,2,3,4,5, 然后是线程2打印6,7,8,9,10, 然后是线程3打印11,12,13,14,15.
 * 接着再由线程1打印16,17,18,19,20....以此类推, 直到打印到75
 */
public class Test1 {
    public static void main(String[] args) {

        Executors.newFixedThreadPool(3);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,15,200,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>(5));



    }
}
