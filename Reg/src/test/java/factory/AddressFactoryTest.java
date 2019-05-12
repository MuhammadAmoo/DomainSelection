package factory;

import domain.Driver.Address;
import org.junit.Test;

public class AddressFactoryTest {

    @Test
    public void getAddress() {
    Address add = AddressFactory.getAddress("street", "area", 7764, 2);

    }
}