package com.ff.entity;

import com.ff.inter.Car;

public class Skoda implements Car {
    @Override
    public void buyCar() {
        System.out.println("Purchasing Skoda car");
    }
}
