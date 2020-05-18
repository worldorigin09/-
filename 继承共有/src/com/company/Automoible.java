package com.company;

import java.util.Date;

public class Automoible extends LandTransport{
    public Automoible(){}

    public Automoible(String i){
    }
    @Override
    public void driveMethod(){
        System.out.println("内燃机供能，平稳疾行");
    }
}
