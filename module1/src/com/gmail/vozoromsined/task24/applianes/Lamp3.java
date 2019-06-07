package com.gmail.vozoromsined.task24.applianes;

public class Lamp3 extends Lightning2 implements WorkWithApplinces {
    @Override
    public void plugIn() {
        if(toPlug){
            System.out.println("lamp plugged already");
        }
        else {
            System.out.println("Lamp is plugged");
            toPlug=true;
        }
    }

    @Override
    public void turnOn() {
        if(power)
            System.out.println("Lamp is already on");
        else
            power=true;
    }

    @Override
    public void turnOff() {
        if(power)
            System.out.println("Lamp not work");
        else
            power=true;
    }
    public void make(){};
}
