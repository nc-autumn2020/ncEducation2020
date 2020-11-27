package com.nc.autumn2020.lesson18.entities;

public class BoxCargo implements Box {
    @Override
    public <T> void put(T t) {

    }

    @Override
    public <T> T get() {
        return null;
    }
    private String name = "BoxCargo";

    @Override
    public String toString() {
        return "BoxCargo{" +
                "name='" + name + '\'' +
                '}';
    }
}
