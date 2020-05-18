package com.company;

import java.util.Date;

public class Airship extends AirTransport{
    public Airship(){}

    public Airship(String i){
    }
    @Override
    public  void driveMethod(){
        System.out.println("喷气滑行");
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
