package com.carllewis14.dagger2example.model;

import javax.inject.Inject;

/**
 * Vehicle model class dependant on Motor model class
 */

public class Vehicle {

    private Motor motor;


    @Inject
    public Vehicle(Motor motor){

        this.motor = motor;
    }

    public void increaseSpeed(int value){

        motor.accelerate(value);

    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){

        return motor.getRpm();
    }



}
