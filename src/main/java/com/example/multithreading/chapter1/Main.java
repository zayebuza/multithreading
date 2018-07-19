package com.example.multithreading.chapter1;

/**
 * Created by miaodongbiao
 * Date:2018/7/19-23:20
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        MyThreadExt myThreadExt = new MyThreadExt();
        myThreadExt.start();
        myThreadExt.start();
    }
}
