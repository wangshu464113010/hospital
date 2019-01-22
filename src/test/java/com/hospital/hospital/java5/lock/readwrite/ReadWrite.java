package com.hospital.hospital.java5.lock.readwrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: hospital
 * @description: 读写锁===>更新锁
 * 相比lock,提交了效率,读锁与读锁不互斥，写锁与写锁互斥，写锁与读锁互斥
 * @author: wangshu
 * @create: 2019-01-21
 *
 *
 *
 *
 **/

public class ReadWrite {

    public static void main(String[] args) {



    }


}

class ShareData{
    private Object data = null;
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get() throws InterruptedException {
        rwl.readLock().lock();
        System.out.println(Thread.currentThread().getName());

        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName());
        rwl.readLock().unlock();//finally中释放锁

    }
    public void put(Object data) throws InterruptedException {
        rwl.writeLock().lock();
        System.out.println(Thread.currentThread().getName());

        Thread.sleep(1000);

        this.data =data;

        System.out.println(Thread.currentThread().getName());
        rwl.writeLock().unlock();
    }

}
