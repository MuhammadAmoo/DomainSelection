package com.amoo.service.impl.driver;

import com.amoo.domain.Driver.Driver;
import com.amoo.repository.Impl.Impl.driver.DriverRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DriverServiceImpl")
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepositoryImpl repository;

    private DriverServiceImpl()
    {
        this.repository = DriverRepositoryImpl.getDriver();
    }

    @Override
    public Set<Driver> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Driver create(Driver driver) {
        return this.create(driver);
    }

    @Override
    public Driver read(String string) {
        return this.repository.read(string);
    }

    @Override
    public Driver update(Driver driver) {
        return this.update(driver);
    }

    @Override
    public void delete(String string) {this.repository.delete(string);
    }

}
