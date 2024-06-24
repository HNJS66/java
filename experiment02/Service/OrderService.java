package com.experiment02.Service;

import com.experiment02.entity.Item;
import com.experiment02.entity.User;

import java.util.List;

public class OrderService {
    public static void addOrder(User user, List<Item> item){
        double sumprice = 0;
        for(Item itemptemp : item){
            sumprice+=itemptemp.getProduct().getPrice() * itemptemp.getNumber();
        }
        if(user.getMoney() >= sumprice){
            System.out.println(sumprice);
            System.out.println(user.getMoney()-sumprice);
            System.out.println(user.getAdress());
        }
        else {
            System.out.println("用户余额不足");
        }
    }

}
