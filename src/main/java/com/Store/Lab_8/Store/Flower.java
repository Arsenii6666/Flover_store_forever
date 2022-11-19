package com.Store.Lab_8.Store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower {
    @Id @GeneratedValue
    private Integer id;
    private double sepalLength;
    private String color;
    private double price;
    private String flowerType;
    public boolean equals(Flower obj){
        if ((this.getSepalLength()== obj.getSepalLength())&&
                (this.getFlowerType().equals(obj.getFlowerType()))&&
                (this.getColor().equals(obj.getColor()))){
            return true;
        }
        return false;
    }
}
