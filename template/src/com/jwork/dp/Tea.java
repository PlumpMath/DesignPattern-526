package com.jwork.dp;

/**
 * ����һ�ֿ���������
 * Created by wangzhijun on 2015/5/7.
 */
public class Tea extends CaffeineBevenage{
    @Override
    protected void addCondiments() {
        System.out.println("��������");
    }

    @Override
    protected void brew() {
        System.out.println("�Ų�Ҷ");
    }
}
