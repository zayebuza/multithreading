package com.example.multithreading.chapter3.TwoThreadTransData;

/**
 * 2 * @Author: miaodongbiao
 * 3 * @Date: 2018/7/24 13:08
 * 4
 */
public class ThreadB extends Thread{


    private MyList myList;

    public ThreadB(MyList list){
        super();
        this.myList = list;
    }
    @Override
    public void run(){
        try {
            while (true){

                 Thread.sleep(1000);
                if (myList.getSize() == 5){

                    System.out.println("===5了，线程B要退出了");

                    throw new InterruptedException();
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
