package com.example.multithreading.threadPool;

import java.util.concurrent.*;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/30 20:38
 */
public class Run {


    public static void main(String[] args) {
       ExecutorService executor2 = Executors.newFixedThreadPool(14);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,15,200,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>(5));
        for (int i =0;i<25;i++){
            MyThread thread = new MyThread(i);
            executor.execute(thread);
            System.out.println("线程中的线程数目:"+executor.getPoolSize()+"+队列中等待的任务数目:"+executor.getQueue().size()+"已执行的任务数目:"+executor.getCompletedTaskCount());
            System.out.println();
        }
    }

}
