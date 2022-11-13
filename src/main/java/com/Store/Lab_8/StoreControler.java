package com.Store.Lab_8;


import com.Store.Lab_8.PayOrder.DHLDeliveryStrategy;
import com.Store.Lab_8.PayOrder.Item;
import com.Store.Lab_8.PayOrder.Order;
import com.Store.Lab_8.PayOrder.PayPalPaymentStrategy;
import com.Store.Lab_8.Store.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StoreControler {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    @GetMapping("/")
    public String index() {
        Order ord = new Order();
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        FlowerBucket flowerBucket=new FlowerBucket();
        flowerBucket.add(flowerPack);
        ord.addItem(flowerBucket);
        ord.setDelivery(new DHLDeliveryStrategy());
        ord.setPayment(new PayPalPaymentStrategy());
        ord.ProcessOrder();
        return ord.toString();
    }
}
