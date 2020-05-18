package com.company;

import java.util.Date;

public class Ship extends MaritimeMeanaOfTransport{
    public Ship(){}

    public Ship(String i){
    }
    @Override
    public void driveMethod(){
        System.out.println("水面游行");
    }
}