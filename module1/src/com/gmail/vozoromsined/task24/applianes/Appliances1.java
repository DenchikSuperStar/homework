package com.gmail.vozoromsined.task24.applianes;

public abstract class Appliances1 implements WorkWithApplinces{
    protected boolean toPlug=false;
    protected boolean power=false;

    @Override
    public void plugIn() {
        System.out.println("Appliance plugged");
    }

    @Override
    public void turnOn() {
        System.out.println("Appliance is on");

    }

    @Override
    public void turnOff() {
        System.out.println("Appliance is of");
    }
}
