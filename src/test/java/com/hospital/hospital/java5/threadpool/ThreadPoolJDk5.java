package com.hospital.hospital.java5.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/

public class ThreadPoolJDk5 {
    public static void main(String[] args) {
        //线程池===>初始化三个线程
        ExecutorService pool = Executors.newFixedThreadPool(3);
//        Executors.newCachedThreadPool();//缓冲线程池
//        Executors.newSingleThreadExecutor();//线程池中只有一个线程，如果线程死亡了，会新建一个线程
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);//定时器的线程池
        scheduledPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("bombing");
            }
        },10,TimeUnit.SECONDS);//参数1：时间，参数2：单位

        Executors.newScheduledThreadPool(3).scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("固定频率运行任务");
            }
        },6,2,TimeUnit.SECONDS);//固定频率运行任务


        for(int k =0;k<10;++k){
            final int a = k;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i=1;i<=10;++i){
                        System.out.println( Thread.currentThread().getName()+"==>"+a+"==>"+i);
                    }
                }
            });
        }
        pool.shutdown();//关闭所有线程
//        pool.shutdownNow();//关系所有线程，不管有没有任务执行





    }



}
