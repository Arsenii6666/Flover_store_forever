package com.Store.Lab_8.Store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/store")
@RestController
public class StoreControler {
    private final StoreService storeService;
    @Autowired
    StoreControler(StoreService storeService){
        this.storeService=storeService;
    }
    @GetMapping
    public List<Flower> somefl() {
        return storeService.getflowerList();
    }
    @PostMapping
    public void addFlower(@RequestBody Flower flower){
        storeService.addFlower(flower);
    }
}
