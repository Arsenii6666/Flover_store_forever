package com.Store.Lab_8;

import com.Store.Lab_8.PayOrder.BasketDecorator;
import com.Store.Lab_8.PayOrder.Item;
import com.Store.Lab_8.PayOrder.ItemDecorator;
import com.Store.Lab_8.PayOrder.RibbonDecorator;
import com.Store.Lab_8.Store.Flower;
import com.Store.Lab_8.Store.FlowerBucket;
import com.Store.Lab_8.Store.FlowerPack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class DecoratorTest {
    private static final int minPrice=10;
    private static final int maxPrice=20;
    private static final int maxNum=5;
    private static final Random random=new Random();
    @Test
    public void decortors(){
        double pr1=random.nextInt(minPrice, maxPrice);
        double pr2=random.nextInt(minPrice, maxPrice);
        Flower fl1= new Flower(1, 6, "blue",  pr1, "Tulip");
        Flower fl2=new Flower(2, 5, "red", pr2, "Rose");
        int num1=random.nextInt(maxNum);
        int num2=random.nextInt(maxNum);
        FlowerPack pack1=new FlowerPack(fl1, num1);
        FlowerPack pack2=new FlowerPack(fl2, num2);
        FlowerBucket bucket= new FlowerBucket();
        bucket.add(pack1);
        bucket.add(pack2);
        Item ord= bucket;
        Assertions.assertEquals(pr1*num1+pr2*num2, ord.price());
        ItemDecorator ord1=new BasketDecorator(ord);
        Assertions.assertEquals(pr1*num1+pr2*num2+4, ord1.price());
        ItemDecorator ord2=new RibbonDecorator(ord1);
        Assertions.assertEquals(pr1*num1+pr2*num2+4+40, ord2.price());
    }
}
