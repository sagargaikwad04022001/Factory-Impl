package com.ff.entity;

import com.ff.inter.Car;

public class Nexon implements Car {
    @Override
    public void buyCar() {
        System.out.println("Purchasing Nexon car");
    }
}
