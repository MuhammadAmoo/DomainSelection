package com.amoo.factory.vehicle;

import com.amoo.domain.Vehicles.Vehicle;
import com.amoo.factory.VehicleFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {


    @Test
    public void getVehicle() {
        Vehicle vehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme white");
        System.out.println(vehicle);
        assertNotNull(vehicle);

    }
}