package com.jwork.dp;

/**
 * �����Լ��ĵ������ӿ�, ���⿴�������ݸ�ʽͳһ��
 * ���ֻ����ã�next����, hasNext����ͳһ�ķ�����
 * ������Ҫ֪�� ����ľ���ʵ��
 * Created by wangzhijun on 2015/5/11.
 */
public interface Iterator<T> {
    T next();
    boolean hasNext();
}
