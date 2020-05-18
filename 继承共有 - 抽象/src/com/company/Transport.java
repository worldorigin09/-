package com.company;

import java.util.Date;

public abstract class Transport {
    private String ownership;
    private String GPSPosition;
    private String price;
    private String id;
    private Date dateOfpurchase;

    public Transport(){}

    public Transport(String ownership,String GPSPosition,String price,String id,Date dateOfpurchase){
        this.dateOfpurchase=dateOfpurchase;
        this.GPSPosition=GPSPosition;
        this.id=id;
        this.ownership=ownership;
        this.price=price;

    }
    public abstract void driveMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();
}
