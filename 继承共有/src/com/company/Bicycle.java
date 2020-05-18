package com.company;

import java.util.Date;

public class Bicycle extends LandTransport{
    public Bicycle(){}

    public Bicycle(String i){
    }
    @Override
    public  void driveMethod(){
        System.out.println("人力骑行");
    }
}
