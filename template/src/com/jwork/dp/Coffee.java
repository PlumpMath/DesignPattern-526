package com.jwork.dp;

/**
 * ������һ�ֿ���������
 * Created by wangzhijun on 2015/5/7.
 */
public class Coffee extends CaffeineBevenage{
    @Override
    protected void addCondiments() {
        System.out.println("��ţ��");
    }

    @Override
    protected void brew() {
        System.out.println("�ſ���");
    }
}
