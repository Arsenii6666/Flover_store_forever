package com.Store.Lab_8.PayOrder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends ItemDecorator{
    private Item item;

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double price() {
        return 40+item.price();
    }
}
