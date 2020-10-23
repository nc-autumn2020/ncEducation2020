package com.nc.autumn2020;

import com.nc.autumn2020.lesson3.Human;

public class Main {
    public static void main(String[] args) {

        Human human = new Human.Builder(1000,"anmi","anotherName").
                age((short) 11).
                job("have work").
                build();
        System.out.println(human);

    }
}
