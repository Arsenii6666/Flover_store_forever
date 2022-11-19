package com.Store.Lab_8.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StoreService {
    @Autowired
    private FlowerRepository flowerRepository;

    public StoreService(FlowerRepository flowerRepository){
        this.flowerRepository=flowerRepository;
    }
    //List.of(new Rose(4, 1), new Chamomile(2, 2), new Tulip(6, 3))
    public List<Flower> getflowerList(){
        return flowerRepository.findAll();
    }
    public void addFlower(Flower flower){
        flowerRepository.save(flower);
    }
}
