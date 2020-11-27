package com.nc.autumn2020.lesson18.entities;

public interface Box {

    <T> void put(T t);
    <T> T get();
}
