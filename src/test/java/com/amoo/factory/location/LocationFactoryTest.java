package com.amoo.factory.location;

import com.amoo.domain.location.Location;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocationFactoryTest {


    @Test
    public void getLocation() {
        Location location = LocationFactory.getLocation(7764,2,"Cape Town","Southern Suburbs","2 Turfall Street");
        System.out.println(location);
        assertNotNull(location);

    }
}