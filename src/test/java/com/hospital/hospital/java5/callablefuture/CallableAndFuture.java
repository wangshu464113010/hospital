package com.hospital.hospital.java5.callablefuture;

import java.util.concurrent.*;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/

public class CallableAndFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Future<String> future = pool.submit(new Callable<String>() {//带有返回值使用submit()
            @Override                       //无返回值建议使用execute()
            public String call() throws Exception {

                System.out.println("------------");
                Thread.sleep(2001);
                return "Hello World";
            }
        });
//        System.out.println(future.get());//阻塞
        String s = null;
        try {
            s = future.get(2, TimeUnit.SECONDS);//2秒之内拿到结果,拿不到抛出异常
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(s);



    }

}
