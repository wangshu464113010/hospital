package com.hospital.hospital.java5.lock;

import javax.sound.midi.Soundbank;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: hospital
 * @description: lock 替代 synchronized
 * 比 synchronized 更强==更加面向对象
 * 读写锁：读锁/写锁
 * 多个读锁不互斥，读锁与写锁互斥，写锁与写锁互斥
 * 以上有JVM控制
 * 读取数据是上读锁，写数据是上写锁
 * @author: wangshu
 * @create: 2019-01-18
 **/

public class LockLearn {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    new Output().output("Hello World!!!");
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    new Output().output("123456789");
                }
            }
        }).start();
    }
}

class Output{

    static Lock lock = new ReentrantLock();

    public void output(String s){
        lock.lock();  //加锁
        try {
            for (int i =0;i<s.length();++i){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }finally {
            lock.unlock();//释放锁
        }
    }
}
