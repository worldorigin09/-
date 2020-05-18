package com.company;

import java.util.Date;

public class Aircraft extends AirTransport{
    public Aircraft(){}

    public Aircraft(String i){
    }
    @Override
    public void driveMethod(){
        System.out.println("高空飞行");
    }

    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }

    @Override
    public void addGas() {

    }
}
