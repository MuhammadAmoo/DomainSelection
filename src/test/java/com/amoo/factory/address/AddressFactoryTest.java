package com.amoo.factory.address;

import com.amoo.domain.driver.Address;
import com.amoo.factory.driver.AddressFactory;
import org.junit.Test;

public class AddressFactoryTest {

    @Test
    public void getAddress() {
    Address add = AddressFactory.getAddress("street", "area", 7764, 2);

    }
}