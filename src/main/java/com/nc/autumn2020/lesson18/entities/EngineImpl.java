package com.nc.autumn2020.lesson18.entities;

public class EngineImpl implements Engine {
    @Override
    public void run(OIL oil) {
        oil.burn();
        System.out.println("Engin start");
    }
}
