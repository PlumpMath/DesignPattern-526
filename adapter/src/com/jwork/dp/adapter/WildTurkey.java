package com.jwork.dp.adapter;

/**
 * �𼦵����ֻ࣬�ܷ�һС�ξ���
 * Created by wangzhijun on 2015/5/7.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("i can only fly a short distance");
    }
}
