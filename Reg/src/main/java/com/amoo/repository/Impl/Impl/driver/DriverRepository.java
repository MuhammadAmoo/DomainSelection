package com.amoo.repository.Impl.Impl.driver;

import com.amoo.domain.Driver.Driver;
import com.amoo.repository.Impl.IRepository;

import java.util.Set;

public interface DriverRepository extends IRepository<Driver, String> {
    Set<Driver> getAll();
}
