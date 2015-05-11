package com.jwork.dp;

/**
 * Ů����Ա�����·�����������Ŀǰ���� ֻ�ܻ�ȡ���Ϸֱ�������������˵���
 * �������ʵ����iterator,���Ҷ��⿪�ţ�ʹ�� ʹ���߼����Լ����߼����ƣ�
 * �����м������Ƿ�����ʳ����
 * Created by wangzhijun on 2015/5/11.
 */
public class Waiter {
    private RestaurantA restaurantA;
    private RestaurantB restaurantB;

    public Waiter(RestaurantA restaurantA, RestaurantB restaurantB) {
        this.restaurantA = restaurantA;
        this.restaurantB = restaurantB;
    }

    public void printAItems(){
        Iterator<MenuItem> iterator = restaurantA.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void printBItems(){
        Iterator<MenuItem> iterator = restaurantB.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void printItems(){
        printAItems();
        printBItems();
    }

    public void printVegetarianItem(){
        while(restaurantA.createIterator().hasNext()){
            MenuItem item = restaurantA.createIterator().next();
            if(item.isVegetarian()){
                System.out.println(item);
            }
        }
    }

    public boolean isItemVegetarian(String itemName){
        return false;
    }
}
