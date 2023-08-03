package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }

    public String getDescription(){
        String furCondition="0";
        String pawsCondition;
        if(numberOfPaws==1){
            pawsCondition = "paw";
        } else{
            pawsCondition = "paws";
        }
        if(hasFur){
            furCondition="a";
        }  else{
            furCondition="no";
        }
        return "This animal is mostly "+ color + ". It has " + numberOfPaws + " " + pawsCondition + " and " + furCondition + " fur";
    }
}
