package com.nc.autumn2020.lesson18;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Container {
    private Map<String, Object> beans = new HashMap<>();
    private Map<String, Method> methods = new HashMap<>();
    private Class[] configs;
    public Container(Class ... configs) {
        this.configs = configs;
        for (Class config : configs) {
            load(config);
        }
    }
    @SneakyThrows
    private void load(Class aClass) {
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Bean.class)) {

                if (declaredMethod.isAnnotationPresent(Prototype.class)) {

                    beans.put(declaredMethod.getName(),null);
                    methods.put(declaredMethod.getName(),declaredMethod);
                    System.out.println("prototype "+declaredMethod.getName());
                } else {
                    Object invoke = declaredMethod.invoke(null);
                    if (declaredMethod.getParameterCount()>0){

                    }
                    beans.put(declaredMethod.getName(), invoke);
                }
            }
        }
    }
    @SneakyThrows
    public <T> T getObject(String name, Class<T> tClass) {
        Object o = beans.get(name);
        if (o==null){

            Method method = methods.get(name);
            Object invoke = method.invoke(null);
            return tClass.cast(invoke);
        }
        return tClass.cast(o);
    }
}
