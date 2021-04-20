package com.rakesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    public Car(){
        System.out.println("Car- constructor");
    }

    @Autowired
   private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car tyre " + tyre;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving a CAR");
    }
}
