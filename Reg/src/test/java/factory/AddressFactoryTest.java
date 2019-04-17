package factory;

import Driver.Address;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressFactoryTest {

    @Test
    public void getAddress() {
    Address add = AddressFactory.getAddress("street", "area", 7764, 2);

    }
}