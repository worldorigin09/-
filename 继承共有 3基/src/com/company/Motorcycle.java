package com.company;

import java.util.Date;

public class Motorcycle extends LandTransport{
    public Motorcycle(){}

    public Motorcycle(String i){
    }
    @Override
    public void driveMethod(){
        System.out.println("内燃机供能，快速急行");
    }
}
