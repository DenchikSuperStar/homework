package com.gmail.vozoromsined.task24.devices;

public abstract class ElectricDevice implements Pluggable {
    protected boolean isPluggedIn = false;

    public void turnOn() {
        if (isPluggedIn()) {
            System.out.println("Device is turned on");
        } else {
            System.out.println("You should plug in your device");
        }
    }
    public void turnOff() {
        System.out.println("Device is turned off");
    }
}
