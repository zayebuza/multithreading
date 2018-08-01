package com.example.multithreading.exercises.DeadLock1;

/**
 * @Author: miaodongbiao
 * @Date: 2018/8/1 19:16
 */
public class DeadLockService {
    private final Object left = new Object();
    private final Object right = new Object();


    public void leftRight(){
        synchronized (left){}
        synchronized (right){
            System.out.println("先左后右");
        }
    }

    public void rightLeft(){
        synchronized (right){
            synchronized (left){
                System.out.println("先右后左");
            }
        }
    }
}