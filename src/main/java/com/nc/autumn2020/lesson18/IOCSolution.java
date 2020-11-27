package com.nc.autumn2020.lesson18;

import com.nc.autumn2020.LessonApi;
import com.nc.autumn2020.lesson18.entities.Box;
import com.nc.autumn2020.lesson18.entities.Car;
import com.nc.autumn2020.lesson18.entities.OIL;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class IOCSolution implements LessonApi {
    @SneakyThrows
    @Override
    public void executeSolution(String[] args) {
     /*   Container container = new Container(Configuration.class,CarConfig.class);
        Box box = container.getObject("box", Box.class);
        Box box2 = container.getObject("box2", Box.class);*/
        // Car car = container.getObject("car", Car.class);

        ApplicationContext container = new AnnotationConfigApplicationContext(
                CarConfig.class, Configuration.class);
        Car car = container.getBean("car", Car.class);
        System.out.println(car);

    }

}

