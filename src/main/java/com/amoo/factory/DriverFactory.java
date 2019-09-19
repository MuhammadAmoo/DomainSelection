package com.amoo.factory;


import com.amoo.domain.Driver.Driver;

public class DriverFactory {

    public static Driver getDriver(String driverFirstName, String driverLastName, int age, String id, String registration_no)
    {
        return new Driver.Builder().age(age)
                .driverFirstName(driverFirstName)
                .driverLastName(driverLastName)
                .id(id)
                .registration_no(registration_no)
                .build();
    }


}
