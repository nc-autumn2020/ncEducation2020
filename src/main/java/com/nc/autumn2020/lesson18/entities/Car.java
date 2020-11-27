package com.nc.autumn2020.lesson18.entities;

public class Car {
    private Box box;
    private Box box2;
    private Driver driver;
    private Engine engine;
    private OIL oil;
    private Wheels wheels;

    void carRun(){
        driver.drive();
        engine.run(oil);
        wheels.rotate();
    }

    @Override
    public String toString() {
        return "Car{" +
                "box=" + box +
                ", driver=" + driver +
                ", engine=" + engine +
                ", oil=" + oil +
                ", wheels=" + wheels +
                '}';
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Box getBox2() {
        return box2;
    }

    public void setBox2(Box box2) {
        this.box2 = box2;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public OIL getOil() {
        return oil;
    }

    public void setOil(OIL oil) {
        this.oil = oil;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}

