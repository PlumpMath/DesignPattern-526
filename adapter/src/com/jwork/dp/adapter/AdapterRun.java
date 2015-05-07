package com.jwork.dp.adapter;

/**
 * client
 * client �뿴Ѽ�ӷɸ��� ��������Ϊ
 * ����Ŀǰû��Ѽ��ֻ�л𼦣�����ֻ���û���ð��
 * ��ʱ��Ҫ������ʵ�� client��Ŀ��ӿڣ�������һ���𼦶���
 * �û𼦵���Ϊ��ģ��Ŀ��ӿڵ���Ϊ
 * Created by wangzhijun on 2015/5/7.
 */
public class AdapterRun {
    public static void main(String srgs[]){
        Duck duck = new MallardDuck();//����һ��ҰѼ��
        testDuckBehaivor(duck);

        Turkey turkey = new WildTurkey();//����һ���𼦲�������Ϊ
        turkey.fly();
        turkey.gobble();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);//�����
        testDuckBehaivor(turkeyAdapter);
    }

    private static void testDuckBehaivor(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println("====behaivor end");
    }
}
