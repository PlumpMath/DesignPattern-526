package com.jwork.dp;

import java.util.ArrayList;

/**
 * java ������ʵ����java�Լ��ĵ���������������ȥʵ�־����߼�
 * Created by wangzhijun on 2015/5/11.
 */
public class RestaurantAIterator implements Iterator{
    private java.util.Iterator iterator;

    private ArrayList<MenuItem> list;

    public RestaurantAIterator(ArrayList<MenuItem> list) {
        this.list = list;
        iterator = list.iterator();
    }

    @Override

    public MenuItem next() {
       return (MenuItem)iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
