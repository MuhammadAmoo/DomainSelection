package com.amoo.service.impl.location;


import com.amoo.domain.Location.Location;
import com.amoo.factory.LocationFactory;
import com.amoo.repository.Impl.Impl.location.LocationRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationServiceImplTest {

    private LocationRepositoryImpl repository;
    private Location getLocation;

    private Location getSaved() {
        return this.repository.getAll().iterator().next();

    }


    @Before
    public void setUp() throws Exception {
        this.repository = LocationRepositoryImpl.getLocation();
        this.getLocation = LocationFactory.getLocation(7764,2,"Cape Town","Southern Suburbs","2 Turfall Street");
    }



    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Location created = this.repository.create(this.getLocation);
        assertNotNull(created);
        assertSame(created, this.getLocation);
    }

    @Test
    public void read() {
        Location loc = this.repository.create(this.getLocation);
        repository.create(loc);
        assertNotNull(repository.read(2));
        System.out.println(repository.getAll());


    }

    @Test
    public void update() {
        Location loc = this.repository.create(this.getLocation);
        repository.create(loc);
        Location updatelocation = LocationFactory.getLocation(7764,3,"Cape Town","Northern Suburbs","4 Turfall Street");
        repository.update(updatelocation);
        assertEquals(updatelocation, repository.read(3));
        System.out.println(repository.getAll());
    }

    @Test
    public void delete() {
        Location loc = this.repository.create(this.getLocation);
        repository.create(loc);
        System.out.println(repository.getAll());
    }

}