package com.interfaces;

public class powerengine implements Engine {

    @Override
    public void start() {
        System.out.println("Power engine starting");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stopping");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerating");
    }

   

}
