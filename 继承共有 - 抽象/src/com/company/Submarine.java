package com.company;

import java.util.Date;

public class Submarine extends MaritimeMeanaOfTransport{
    public Submarine(){}

    public Submarine(String i){
    }
    @Override
    public void driveMethod(){
        System.out.println("深水潜行");
    }
}
