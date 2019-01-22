package com.hospital.hospital.java5.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: hospital
 * @description:线程之间的通信 ==> 类似Object的wait和notify/notifyAll
 *      但是功能更强
 * 改变一个变量
 * @author: wangshu
 * @create: 2019-01-22
 * 阻塞队列
 *
 **/

public class ConditionClass {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public static void main(String[] args) {

    }
    private void get() throws InterruptedException {
        condition.await();//等待
        condition.signal();//唤醒
    }







}
