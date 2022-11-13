package com.Store.Lab_8.PayOrder;

import lombok.Getter;

@Getter
public abstract class Item {
    String description;
    abstract public double price();
}
