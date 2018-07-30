package com.example.multithreading.chapter3.TwoThreadTransData;

import java.util.List;

/**
 * 2 * @Author: miaodongbiao
 * 3 * @Date: 2018/7/24 13:02
 * 4
 */
public class ThreadA extends Thread {

    private MyList myList;

    public ThreadA(MyList list){
        super();
        this.myList = list;
    }
    @Override
    public void run(){

            try {
                for (int i =0;i<10;i++) {
                    myList.add();
                    System.out.println("添加了第" + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



    }
}
