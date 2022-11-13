package com.Store.Lab_8.Store;

import com.Store.Lab_8.PayOrder.Item;
import java.util.ArrayList;


public class FlowerBucket extends Item{
    public double price(){
        return price;
    }
    private ArrayList<FlowerPack> FlowerPacks=new ArrayList();
    private double price=0;
    public void add(FlowerPack flowerPack){
        FlowerPacks.add(flowerPack);
        price+= flowerPack.getPrice();
    }
    public int find_flowers(Flower flower){
        int fl_num=0;
        for(FlowerPack fl_pack: FlowerPacks){
            if (fl_pack.equals(flower)){
                fl_num+=fl_pack.getQuantity();
            }
        }
        return fl_num;
    }
}
