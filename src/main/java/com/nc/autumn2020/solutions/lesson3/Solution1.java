package com.nc.autumn2020.solutions.lesson3;

import com.nc.autumn2020.lesson3.Human;

public class Solution1 {

    public void run(String[] args){
        System.out.println("some solution implementation example");
        Human human = new Human.Builder(1000,"anmi","anotherName").
                age((short) 11).
                job("have work").
                build();
        System.out.println(human);
    }


}
