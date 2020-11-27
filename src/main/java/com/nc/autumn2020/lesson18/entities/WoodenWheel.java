package com.nc.autumn2020.lesson18.entities;

public class WoodenWheel implements Wheels {
    @Override
    public void rotate() {
        System.out.println("wooden wheel slowly rotated");
    }
}
