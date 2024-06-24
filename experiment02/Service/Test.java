package com.experiment02.Service;


import com.experiment02.entity.Item;
import com.experiment02.entity.Order;
import com.experiment02.entity.Product;
import com.experiment02.entity.User;

import java.util.ArrayList;
import java.util.List;

import static com.experiment02.Service.OrderService.addOrder;


public class Test {
    public static void main(String[] args){
        User userMan = new User("xiaoming", 1000.3, "nefu");
        Product goods1 = new Product("tomato",10.23);
        Product goods2 = new Product("potato",20.00);
        List<Item> items= new ArrayList<>();
        Item item1 = new Item(goods1,2);
        Item item2 = new Item(goods2,5);
        items.add(item1);
        items.add(item2);
        addOrder(userMan, items);





        /*Order order1 = creatUP();
        Order order2;
        order2  = addOrder(order1);
        System.out.println(order2.getPrice());
        System.out.println(order2.getUser().getMoney()-order2.getPrice());
        System.out.println(order2.getUser().getAdress());
        if(order2 != null){
            System.out.println(order2.getPrice());
            System.out.println(order2.getUser().getMoney()-order2.getPrice());
            System.out.println(order2.getUser().getAdress());
        }
        else{
            System.out.println("用户余额不足");
        }*/
    }

}
