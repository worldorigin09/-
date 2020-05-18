package com.company;


public class Person {
    private String  id;
    private String p_sex;
    private String p_name;
    private String p_age;

    public Person(){}

    public Person(String id,String p_age,String p_name,String p_sex)
    {
        this.id=id;
        this.p_age=p_age;
        this.p_name=p_name;
        this.p_sex=p_sex;

    }
    public void driveTransport(Aircraft i){
        Aircraft.driveMethod();
    }
    public void driveTransport(Ship i){
        Ship.driveMethod();
    }
    public void driveTransport(HotAirBalloon i){
        HotAirBalloon.driveMethod();
    }
    public void driveTransport(Bicycle i){
        Bicycle.driveMethod();
    }
    public void driveTransport(Motorcycle i){
        Motorcycle.driveMethod();
    }
    public void driveTransport(Automoible i){
        Automoible.driveMethod();
    }
    public void driveTransport(Submarine i){
        Submarine.driveMethod();
    }
    public void driveTransport(Airship i){
        Airship.driveMethod();
    }
    public void driveTransport(Hovercraft i){
        Hovercraft.driveMethod();
    }

}
