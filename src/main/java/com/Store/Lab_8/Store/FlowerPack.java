package com.Store.Lab_8.Store;
import lombok.Getter;


@Getter
public class FlowerPack {
    private final Flower flower;
    private int quantity;
    private double price;
    public FlowerPack(Flower flower1, int quantity1){
        flower=flower1;
        quantity=quantity1;
        price=flower.getPrice()*quantity;
    }
    public boolean equals(Flower obj) {
        return flower.equals(obj);
    }
}
