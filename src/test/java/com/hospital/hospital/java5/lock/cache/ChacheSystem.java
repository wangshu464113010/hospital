package com.hospital.hospital.java5.lock.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: hospital
 * @description: 缓冲系统
 * @author: wangshu
 * @create: 2019-01-22
 **/

public class ChacheSystem {

    private Map<String,Object> cache = new HashMap<>();

    public static void main(String[] args) {

    }
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    public Object getData(String key){
        lock.readLock().lock();//加读锁
        Object value = null;
        try {
            value = cache.get(key);
            if(value==null){
                lock.readLock().unlock();//释放读锁
                lock.writeLock().lock();//加写锁
                try {
                    if(value==null){//防止多个线程还需要加载数据
                        value = new Object(); //从数据库取出数据
                    }
                }finally {
                    lock.writeLock().unlock();//释放写锁
                }
                lock.readLock().lock();//恢复读锁
            }
        }finally {
            lock.readLock().unlock();//释放读锁
        }
        return value;
    }



    public synchronized Object getData1(String key){
        Object value = cache.get(key);
        if(value==null){
            value = new Object(); //从数据库取出数据
        }
        return value;
    }



}
