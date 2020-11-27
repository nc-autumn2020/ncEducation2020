package com.nc.autumn2020.lesson18.entities;

public class GasOIL implements OIL {

    private int capacity;

    public GasOIL(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void burn() {
        System.out.println("GAS burned");
    }

    @Override
    public String toString() {
        return "GasOIL{" +
                "capacity=" + capacity +
                '}';
    }
}
