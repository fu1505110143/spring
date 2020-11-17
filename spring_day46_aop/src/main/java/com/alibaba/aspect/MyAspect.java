package com.alibaba.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @Author :fuwei
 * @Date:2020/11/12 16:33
 * @Version 1.0
 */
@Component
public class MyAspect {
    public void checkPermission(){
        System.out.println ("进行权限校验");
    }
    public void printRuselt(String result){
        System.out.println ("返回值"+result);
    }
    public void printError(Throwable errorMsg){
        errorMsg.printStackTrace();
        //使用流将字符串(异常信息)，写入到本地磁盘文件中
        System.out.println("使用FileOutputStream将" + errorMsg.getStackTrace() + "写入到磁盘...");
    }

    public void close(){
        System.out.println("执行资源回收的操作...");
    }

    public void totalTime(ProceedingJoinPoint joinPoint){
        try {
            //1. 获取当前时间
            long startTime = System.currentTimeMillis();
            //2. 执行切入点
            Object obj = joinPoint.proceed();
            //3. 获取执行完切入点之后的时间
            long endTime = System.currentTimeMillis();
            System.out.println("方法的总执行时间是:" + (endTime - startTime));
//            return "hello:"+obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw new RuntimeException(throwable.getMessage());
        }
    }
}
