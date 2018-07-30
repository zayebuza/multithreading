package com.example.multithreading.chapter3.TwoThreadTransData;

/**
 * 2 * @Author: miaodongbiao
 * 3 * @Date: 2018/7/24 13:10
 * 4
 */
public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();

        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}
