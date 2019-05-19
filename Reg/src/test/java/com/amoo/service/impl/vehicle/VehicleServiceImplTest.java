package com.amoo.service.impl.vehicle;

import com.amoo.domain.Vehicles.Vehicle;
import com.amoo.factory.VehicleFactory;
import com.amoo.repository.Impl.Impl.vehicle.VehicleRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class VehicleServiceImplTest {
    
    private VehicleRepositoryImpl repository;
    private  Vehicle getVehicle;

    private Vehicle getSaved() {
        return this.repository.getAll().iterator().next();

    }

    @Before
    public void setUp() throws Exception {
        this.repository = VehicleRepositoryImpl.getVehicle();
        this.getVehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme white");
    }


    @Test
    public void getAll() {
    }


    @Test
    public void create() {
        Vehicle created = this.repository.create(this.getVehicle);
        assertNotNull(created);
        assertSame(created, this.getVehicle);
    }

    @Test
    public void read() {
        Vehicle vv = this.repository.create(this.getVehicle);
        repository.create(vv);
        assertNotNull(repository.read("CA789245"));
        System.out.println(repository.getAll());


    }

    @Test
    public void update() {
        Vehicle vv = this.repository.create(this.getVehicle);
        repository.create(vv);
        Vehicle updatevehicle = VehicleFactory.getVehicle(2010, "CA124786", "RunX", "Blue");
        repository.update(updatevehicle);
        assertEquals(updatevehicle, repository.read("CA666"));
        System.out.println(repository.getAll());
    }

    @Test
    public void delete() {
        Vehicle vv = this.repository.create(this.getVehicle);
        repository.create(vv);
        System.out.println(repository.getAll());
    }
    
}
