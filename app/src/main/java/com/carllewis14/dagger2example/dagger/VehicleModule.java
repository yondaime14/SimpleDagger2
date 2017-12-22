package com.carllewis14.dagger2example.dagger;

import com.carllewis14.dagger2example.model.Motor;
import com.carllewis14.dagger2example.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Vehicle Module class for dependency injection
 */

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }


}
