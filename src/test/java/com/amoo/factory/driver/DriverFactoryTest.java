package com.amoo.factory.driver;

import com.amoo.domain.Driver.Driver;
import com.amoo.factory.DriverFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverFactoryTest {

    @Test
    public void getDriver() {
        Driver driv = DriverFactory.getDriver(
                "Muhammad",
                "Amoo",
                23,
                "5",
                "CA7891234");
        System.out.println(driv);
        assertNotNull(driv);

    }
}