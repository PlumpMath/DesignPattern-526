package com.jwork.dp.adapter;

/**
 * ҰѼ��ʵ����Ѽ�ӵ�fly �� quack������Ϊ
 * Created by wangzhijun on 2015/5/7.
 */
public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }
}
