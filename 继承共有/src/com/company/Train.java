package com.company;

public class Train extends LandTransport{
    public Train(){}

    public Train(String i){
    }
    @Override
    public void driveMethod(){
        System.out.println("沿轨道前行");
    }
}
