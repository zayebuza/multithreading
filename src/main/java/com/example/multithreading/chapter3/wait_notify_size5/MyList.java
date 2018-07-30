package com.example.multithreading.chapter3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: miaodongbiao
 * @Date: 2018/7/28 19:13
 */
public class MyList {
    private static List arrayList = new ArrayList();

    public static void add(){
        arrayList.add("mdb");
    }
    public  static int getSize(){
        return arrayList.size();
    }



}
