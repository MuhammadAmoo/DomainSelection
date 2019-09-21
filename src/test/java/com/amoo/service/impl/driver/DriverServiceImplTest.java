package com.amoo.service.impl.driver;

import com.amoo.domain.driver.Driver;
import com.amoo.factory.driver.DriverFactory;
import com.amoo.repository.Impl.driver.DriverRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverServiceImplTest {

    private DriverRepositoryImpl repository;
    private Driver getDriver;

    private Driver getSaved() {
        return this.repository.getAll().iterator().next();

    }

    @Before
    public void setUp() throws Exception {
    this.repository = DriverRepositoryImpl.getDriver();
    this.getDriver = DriverFactory.getDriver("Muhammad", "Amoo", 22, "2", "CA66923" );

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Driver created = this.repository.create(this.getDriver);
        assertNotNull(created);
        assertSame(created, this.getDriver);
    }

    @Test
    public void read() {


    }

    @Test
    public void update() {
        Driver dd = this.repository.create(this.getDriver);
        repository.create(dd);
        Driver updatedriver = DriverFactory.getDriver("Alex", "Mercer", 21, "3", "CA666" );
        repository.update(updatedriver);
        assertEquals(updatedriver, repository.read("CA666"));
        System.out.println(repository.getAll());
    }

    @Test
    public void delete() {
        Driver dd = this.repository.create(this.getDriver);
        repository.create(dd);
        System.out.println(repository.getAll());
    }
}