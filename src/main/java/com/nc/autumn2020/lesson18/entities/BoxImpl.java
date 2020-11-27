package com.nc.autumn2020.lesson18.entities;

public class BoxImpl implements Box {
    private String name= "SomeBox";

    @Override
    public <T> void put(T t) {

    }

    @Override
    public <T> T get() {
        return null;
    }


    @Override
    public String toString() {
        return "BoxImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
