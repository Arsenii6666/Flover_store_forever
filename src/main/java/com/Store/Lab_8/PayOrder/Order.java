package com.Store.Lab_8.PayOrder;

import lombok.Setter;
import java.util.LinkedList;
import java.util.List;

public class Order {
    List<Item> items= new LinkedList<>();
    @Setter
    Payment payment;
    @Setter
    Delivery delivery;
    double CalculateTotalPrice(){
        double sum=0;
        for(Item itm: items ){
            sum+=itm.price();
        }
        return sum;
    }
    public void ProcessOrder(){
        payment.pay_order(CalculateTotalPrice());
        delivery.deliver(items);
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "payment=" + payment +
                ", delivery=" + delivery +
                '}';
    }
}
