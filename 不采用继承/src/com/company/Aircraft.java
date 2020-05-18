package com.company;

import java.util.Date;

public class Aircraft {
    private String ownership;
    private String GPSPosition;
    private String price;
    private String id;
    private Date dateOfpurchase;

    public Aircraft(){}

    public Aircraft(String ownership,String GPSPosition,String price,String id,Date dateOfpurchase){
        this.dateOfpurchase=dateOfpurchase;
        this.GPSPosition=GPSPosition;
        this.id=id;
        this.ownership=ownership;
        this.price=price;

    }
    public static void driveMethod(){
        System.out.println("高空飞行");
    }
}
