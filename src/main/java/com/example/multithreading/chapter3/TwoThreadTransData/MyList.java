package com.example.multithreading.chapter3.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * 2 * @Author: miaodongbiao
 * 3 * @Date: 2018/7/24 12:58
 * 4
 */
public class MyList {
    private List myList = new ArrayList();

    public void add(){
        myList.add("苗东彪");
    }

    public int getSize(){
        return myList.size();
    }
}
