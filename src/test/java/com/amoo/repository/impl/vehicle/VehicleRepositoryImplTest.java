package com.amoo.repository.impl.vehicle;

import com.amoo.domain.vehicle.Vehicle;
import com.amoo.factory.vehicle.VehicleFactory;
import com.amoo.repository.Impl.vehicle.VehicleRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleRepositoryImplTest {

    VehicleRepositoryImpl veh;
    
    
    @Before
    public void setUp() throws Exception {
        veh = VehicleRepositoryImpl.getVehicle();
    }

    @Test
    public void create() {
        Vehicle vehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme white");
        veh.create(vehicle);
        assertNotNull(veh.getAll());
        System.out.println(veh.getAll());
                
    }

    @Test
    public void read() {
        Vehicle vehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme white");
        veh.create(vehicle);
        assertNotNull(veh.read("CA789245"));
        System.out.println(veh.read("CA789245"));
        
        
    }

    @Test
    public void update() {
        Vehicle vehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme white");
        veh.create(vehicle);
        assertNotNull(veh.read("CA789245"));
        System.out.println(veh.getAll());

        Vehicle updatevehicle = VehicleFactory.getVehicle(1997,"CA567823","Corolla","Black");
        veh.create(updatevehicle);
        assertEquals(updatevehicle, veh.read("CA567823"));
        System.out.println(veh.getAll());


    }

    @Test
    public void delete() {
        Vehicle vehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme white");
        veh.create(vehicle);
        assertNotNull(veh.read("CA789245"));
        veh.delete("CA789245");
        assertNull(veh.read("CA789245"));
        System.out.println(veh.getAll());
        
        
    }
}