package com.hospital.hospital;

import org.junit.runner.Runner;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-17
 **/

public class MultiThreadShareData {

    public static void main(String[] args) {
        final ShareData1 data1 = new ShareData1();
//        new Thread(data1).start();
//        new Thread(data1).start();
//        new Thread(data1).start();
//        new Thread(data1).start();
//        new Thread(data1).start();
//        new Thread(data1).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                data1.decrement();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                data1.increment();
            }
        }).start();

    }


}
class ShareData1 implements Runnable {

    private int count = 100;//买票

    private int j =0;

    public synchronized void increment(){
        System.out.println("increment"+j);
        j++;
    }
    public synchronized void decrement(){
        System.out.println("decrement" + j);
        j--;
    }

    @Override
    public void run() {
        while (true){
            synchronized (ShareData1.class){
                System.out.println(Thread.currentThread().getName()+"===>"+count);
                count--;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
