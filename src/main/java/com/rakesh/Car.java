package com.rakesh;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("I'm driving a CAR");
    }
}
