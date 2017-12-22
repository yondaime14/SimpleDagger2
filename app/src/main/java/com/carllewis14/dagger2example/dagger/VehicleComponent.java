package com.carllewis14.dagger2example.dagger;

import com.carllewis14.dagger2example.model.Motor;
import com.carllewis14.dagger2example.model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Vehicle component class it connects @Modules with @Inject
 * specify modules needed and methods
 */

@Singleton
@Component (modules = {
        VehicleModule.class
})
public interface VehicleComponent {

    Vehicle provideVehicle();
    Motor provideMotor();
}
