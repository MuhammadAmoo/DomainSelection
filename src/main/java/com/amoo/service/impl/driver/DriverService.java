package com.amoo.service.impl.driver;

import com.amoo.domain.driver.Driver;
import com.amoo.service.IService;

import java.util.Set;

public interface DriverService extends IService<Driver, String> {
    Set<Driver> getAll();
}
