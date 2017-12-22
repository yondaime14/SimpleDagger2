package com.carllewis14.dagger2example.model;

/**
 * Motor data model Class
 */

public class Motor {

    private int rpm;

    public Motor(){

        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }


    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake(){

        rpm = 0;
    }
}
