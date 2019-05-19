package com.amoo.factory;

import com.amoo.domain.Vehicles.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(int year_of_manufacturer, String registration_no, String model, String colour){
        return new Vehicle.Builder()
                   .year_of_manufacturer(year_of_manufacturer)
                   .colour(colour)
                   .model(model)
                   .registration_no(registration_no).build();

    }

}
