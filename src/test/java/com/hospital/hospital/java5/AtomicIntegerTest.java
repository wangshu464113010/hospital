package com.hospital.hospital.java5;/**
 * @author wangshu
 * @create 2019-01-18-13:07
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/

public class AtomicIntegerTest {

    private static final int THREADS_CONUT = 20;
    public static AtomicInteger count = new AtomicInteger(0);

    public static void increase() {
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_CONUT];
        for (int i = 0; i < THREADS_CONUT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        System.out.println(count);
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(count);
    }
}