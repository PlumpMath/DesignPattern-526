package com.jwork.dp.singleton;

/**
 * ����ģʽ������
 * Created by wangzhijun on 2015/5/4.
 */
public class SingleTonRun {
    public static void main(String args[]){
        System.out.println("SingleTonRun Main Test");
        SingleTonEarly.getInstance();
        SingleTonLazy.getInstance();
        SingleTonSafe.getInstance();
    }
}
