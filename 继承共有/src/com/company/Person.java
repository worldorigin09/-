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

    public void driveTransport(Transport i){
        Transport transport=new Transport();
        transport.driveMethod();
    }


}
