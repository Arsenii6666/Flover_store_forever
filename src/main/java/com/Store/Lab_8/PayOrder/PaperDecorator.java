package com.Store.Lab_8.PayOrder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double price() {
        return 13+item.price();
    }
}
