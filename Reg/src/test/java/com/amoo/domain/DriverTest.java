package com.amoo.domain;

import static org.junit.Assert.assertNotNull;

import com.amoo.domain.Driver.Driver;
import com.amoo.factory.DriverFactory;
import org.junit.Test;

public class DriverTest
{

    @Test
    public void getDriver()
    {
        String name = "com.amoo.domain.Driver list";
        Driver drive = DriverFactory.getDriver("Muhammad", "amoo", 22, "9705235079089",
                "254682");

        System.out.println(drive);
        assertNotNull(drive);

    }
}
