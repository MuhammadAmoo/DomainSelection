package repository.Impl.driver;

import domain.Driver.Driver;
import factory.DriverFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverRepositoryImplTest {

     DriverRepositoryImpl drive;
    @Before
    public void setUp() throws Exception {
        drive = DriverRepositoryImpl.getDriver();
    }

    @Test
    public void create() {
        Driver driver = DriverFactory.getDriver("Muhammad", "Amoo", 22, "9705235079089", "CA92345");
        drive.create(driver);
        assertNotNull(drive.getAll());
        System.out.println(drive.getAll());

    }

    @Test
    public void read() {
        Driver driver = DriverFactory.getDriver("Muhammad", "Amoo", 22, "9705235079089", "CA92345");
        drive.create(driver);
        assertNotNull(drive.read("CA5465"));
        System.out.println(drive.read("CA5465"));



    }

    @Test
    public void update() {
        Driver driver = DriverFactory.getDriver("Muhammad", "Amoo", 22, "9705235079089", "CA92345");
        drive.create(driver);
        assertNotNull(drive.getAll());
        System.out.println(drive.getAll());

        Driver updatedriver = DriverFactory.getDriver("Jacob", "Osman", 23, "9703479385309", "CA5465");
        drive.create(updatedriver);
        assertEquals(updatedriver, drive.read("CA5465"));
        System.out.println(drive.getAll());

    }

    @Test
    public void delete() {
        Driver driver = DriverFactory.getDriver("Muhammad", "Amoo", 22, "9705235079089", "CA92345");
        drive.create(driver);
        assertNotNull(drive.read("CA5465"));

        drive.delete("CA5465");
        assertNull(drive.read("CA5465"));
        System.out.println(drive.getAll());


    }
}