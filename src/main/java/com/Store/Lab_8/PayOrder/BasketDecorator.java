package com.Store.Lab_8.PayOrder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator{
    private Item item;

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double price() {
        return 4+item.price();
    }
}
