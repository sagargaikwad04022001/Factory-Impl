package com.ff.entity;

import com.ff.inter.Car;

public class Hyundai implements Car {
    @Override
    public void buyCar() {
        System.out.println("Purchasing Hyundai car");
    }
}
