package com.Store.Lab_8.PayOrder;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        return;
    }
    @Override
    public String toString() {
        return "PostDelivery";
    }
}
