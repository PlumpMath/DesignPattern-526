package com.jwork.dp;

/**
 * ���ģʽ��������
 * ׼������Ӱ����Ҫһϵ�в���
 * Created by wangzhijun on 2015/5/7.
 */
public class FacadeRun {
    public static void main(String args[]){
        Light light = new Light();
        Screen screen = new Screen();
        Popper popper = new Popper();
        //and so on
        MovieFacade facade = new MovieFacade(light,screen,popper);

        facade.startMovie();
    }
}
