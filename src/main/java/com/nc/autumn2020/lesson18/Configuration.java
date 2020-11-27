package com.nc.autumn2020.lesson18;

import com.nc.autumn2020.lesson18.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.Random;

public class Configuration {
    @Bean
    public static Box box() {
        return new BoxImpl();
    }

    @Bean
    public static Box box2() {
        return new BoxCargo();
    }

    @Bean
    public static Driver driver() {
        return new DriverImpl();
    }

    @Bean
    @Scope("prototype")
    public static OIL oil() {
        return new GasOIL(new Random().nextInt(100));
    }

    @Bean
    public static Engine engine() {
        return new EngineImpl();
    }

    @Bean
    public static Wheels wheels() {
        return new WoodenWheel();
    }

}
