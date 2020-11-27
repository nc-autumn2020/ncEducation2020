package com.nc.autumn2020.lesson18.entities;

public class DriverImpl implements Driver {

    private String name = "Driver";

    @Override
    public void drive() {
        System.out.println("Driver start");
    }

    @Override
    public String toString() {
        return "DriverImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
