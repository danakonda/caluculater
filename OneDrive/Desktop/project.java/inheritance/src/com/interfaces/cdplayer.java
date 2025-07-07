package com.interfaces;

public class cdplayer implements media {

    @Override
    public void start() {
        System.out.println("Starting CD");
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD");
    }

}