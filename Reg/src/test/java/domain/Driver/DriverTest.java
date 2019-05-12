package domain.Driver;

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
        String name = "domain.Driver list";
        Driver drive = DriverFactory.getDriver("Muhammad", "Amoo", 22, "9705235079089",
                "254682");

        System.out.println(drive);
        assertNotNull(drive);

    }
}
