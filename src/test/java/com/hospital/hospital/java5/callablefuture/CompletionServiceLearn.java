package com.hospital.hospital.java5.callablefuture;/**
 * @author wangshu
 * @create 2019-01-18-19:02
 */

import java.util.Random;
import java.util.concurrent.*;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-18
 **/

public class CompletionServiceLearn {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(10);
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool);
        for(int i =1;i<11;++i){//提交10个任务
            final int a=i;
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(new Random().nextInt(5000));
                    return a;
                }
            });
        }
        for(int i =1;i<11;++i){//获得结果
            Future<Integer> take = completionService.take();
            System.out.println(take.get());
        }


    }
}
