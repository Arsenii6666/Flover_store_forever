package com.Store.Lab_8.Store;

import java.util.ArrayList;

public class Store {
    private ArrayList<FlowerBucket> Buckets=new ArrayList();
    public void add(FlowerBucket bucket){
        Buckets.add(bucket);
    }
    public int find(Flower flower){
        int fl_num=0;
        for(FlowerBucket bucket:Buckets){
            fl_num+=bucket.find_flowers(flower);
        }
        return fl_num;
    }
}
