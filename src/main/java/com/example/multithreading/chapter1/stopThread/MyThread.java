package com.example.multithreading.chapter1.stopThread;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/28 16:03
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        try {
            for (int i =1;i<1000000;i++){
                if (this.isInterrupted()){
                    System.out.println("我被命令停止了，我要用异常的方式停止");
                    throw new InterruptedException();
                }
                System.out.println("i = "+i);
            }
            System.out.println("我是for循环外的辅助语句，如果我被输出，表示：1，还没执行到thread.interrupt 2，线程并未停止");
        }catch (InterruptedException e){
            System.out.println("我是run方法里的catch");
            e.printStackTrace();
        }
    }
}
