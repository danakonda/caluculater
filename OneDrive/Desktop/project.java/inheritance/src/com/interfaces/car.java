package com.interfaces;

public class car implements Engine,Brakes,media {
    int a=30;
    @Override 
    public void start() {
        System.out.println("Starting car");
    }       
    @Override
    public void stop() {
        System.out.println("Stopping car");
    }
    @Override
    public void brake() {
        System.out.println("Braking car");
    }   
    @Override
    public void acc() {
        System.out.println("Accelerating car");
    }

}
