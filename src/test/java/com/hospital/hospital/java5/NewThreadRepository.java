package com.hospital.hospital.java5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: hospital
 * @description: java.util.concurrent包
 * jdk5
 * @author: wangshu
 * @create: 2019-01-18
 **/

public class NewThreadRepository {
    static int age ;
    /**Atomic+基本数据类型(数组)/对象里面的整数
     */
    static AtomicInteger atomicAge = new AtomicInteger(0);//多线程共享数据

   static public void increment(){
        atomicAge.incrementAndGet();
    }


    public static void main(String[] args) {
        for (int i=1;i<=2000;++i){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    NewThreadRepository.increment();
                }
            }).start();
        }
        System.out.println(NewThreadRepository.atomicAge);

    }







}
