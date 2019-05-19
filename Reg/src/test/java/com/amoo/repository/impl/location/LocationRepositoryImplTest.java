package com.amoo.repository.impl.location;

import com.amoo.domain.Location.Location;
import com.amoo.factory.LocationFactory;
import com.amoo.repository.Impl.Impl.location.LocationRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationRepositoryImplTest {

    LocationRepositoryImpl loc;

    @Before
    public void setUp() throws Exception {
        loc = LocationRepositoryImpl.getLocation();
    }

    @Test
    public void create() {
        Location location = LocationFactory.getLocation(7764, 1, "Grahamstown", "Ola Park", "2 Allie Street");
        loc.create(location);
        assertNotNull(loc.getAll());
        System.out.println(loc.getAll());


    }

    @Test
    public void read() {
        Location location = LocationFactory.getLocation(7764, 1, "Grahamstown", "Ola Park", "2 Allie Street");
        loc.create(location);
        assertNotNull(loc.read(1));
        System.out.println(loc.read(1));



    }

    @Test
    public void update() {
        Location location = LocationFactory.getLocation(7764, 1, "Grahamstown", "Ola Park", "2 Allie Street");
        loc.create(location);
        assertNotNull(loc.read(1));
        System.out.println(loc.getAll());

        Location updatelocation = LocationFactory.getLocation(7766, 2, "Cape Town", "Athlone", "11 Bird Street");
        loc.create(updatelocation);
        assertEquals(updatelocation, loc.read(2));
        System.out.println(loc.getAll());



    }

    @Test
    public void delete() {
        Location location = LocationFactory.getLocation(7764, 1, "Grahamstown", "Ola Park", "2 Allie Street");
        loc.create(location);
        assertNotNull(loc.read(1));

        loc.delete(1);
        assertNull(loc.read(1));
        System.out.println(loc.getAll());




    }
}