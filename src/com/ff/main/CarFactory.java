package com.ff.main;

import com.ff.entity.Hyundai;
import com.ff.entity.Nexon;
import com.ff.entity.Skoda;
import com.ff.inter.Car;
import java.util.Scanner;


public class CarFactory {
    private static Car car;
    public static void main(String[] args) {
          factory().buyCar();
    }
    private static Car factory(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select car for purchasing:\n 1.Hyundai \n 2.Nexon \n 3.Skoda");
        int choice=scanner.nextInt();
        switch (choice)
        {
            case 1:{
                car=new Hyundai();
            }
            break;
            case 2:{
                car=new Nexon();
            }
            break;
            case 3:{
                car=new Skoda();
            }
        }
        return car;
    }
}
