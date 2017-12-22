package com.carllewis14.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.carllewis14.dagger2example.dagger.DaggerVehicleComponent;
import com.carllewis14.dagger2example.dagger.VehicleComponent;
import com.carllewis14.dagger2example.dagger.VehicleModule;
import com.carllewis14.dagger2example.model.Motor;
import com.carllewis14.dagger2example.model.Vehicle;

public class MainActivity extends AppCompatActivity {

    private Vehicle mVehicle;
    private Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        mVehicle = component.provideVehicle();
        motor = component.provideMotor();

        Toast.makeText(this, String.valueOf(mVehicle.getSpeed()), Toast.LENGTH_LONG).show();


    }
}
