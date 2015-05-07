package com.jwork.dp;

/**
 * ����������
 * �߲㣨���ࣩ�����㷨ģ�壬�����Զ��平�ӣ��ɸ߲�����������
 * ����Բ�ͬ���ǣ��̳�����ϡ�
 * ������ȫ�滻�㷨�����㷨�壩��ģ���ǲ��ֽ������ദ��
 * Created by wangzhijun on 2015/5/7.
 */
abstract class CaffeineBevenage {
    /**
     * ׼������
     * final���ɱ���д
     */
    final void preparerecipe(){
        boidWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * ������
     * Ҳ���Խ�hook ���� ���ࣨ�Ͳ㣩�����Ƿ���д
     * ����Ҳ������Ϊ�ж���������������if(useXXX()),useXXX()����������д
     */
    protected abstract void addCondiments();

    /**
     * ��������
     */
    protected void pourInCup(){
        System.out.println("pourInCup");
    }

    /**
     * ��
     */
    protected abstract void brew();

    /**
     * ��ˮ
     */
    protected void boidWater(){
        System.out.println("boidWater");
    }
}
