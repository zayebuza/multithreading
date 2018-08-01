package com.example.multithreading.exercises.five;

/**
 * @Author: miaodongbiao
 * @Date: 2018/8/1 15:56
 * 启动3个线程打印递增的数字, 线程1先打印1,2,3,4,5, 然后是线程2打印6,7,8,9,10,
 *    然后是线程3打印11,12,13,14,15. 接着再由线程1打印16,17,18,19,20….以此类推, 直到打印到75
 *方法：
 *    1，共享成员变量是递增的数字
 *       线程执行有序   可使用conditon唤醒指定线程
 *
 *    2，设置线程id，根据线程id和数字的关系进行打印
 *
 *    3，
 */
public class Run5 {
}
