package Driver;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import factory.DriverFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DriverTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getDriver()
    {
        String name = "Driver list";
        Driver drive = DriverFactory.getDriver("MAtthew", "Booysen", 22, "97052224668553", 254682);

        System.out.println(drive);
        assertNotNull(drive);

    }
}
