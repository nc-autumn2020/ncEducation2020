package com.nc.autumn2020.lesson18;

import com.nc.autumn2020.lesson18.entities.*;
import org.springframework.context.annotation.Bean;

public class CarConfig {

    @Bean
    public static Car car(Box box2, Box box, Driver driver, Engine engine, OIL oil, Wheels wheels) {
        Car car = new Car();
        car.setBox(box);
        car.setBox2(box2);

        return car;
    }

}
