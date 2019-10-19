package com.amoo.service.impl.driver;

import com.amoo.domain.driver.Driver;
import com.amoo.repository.Impl.driver.DriverRepositoryImpl;
import com.amoo.repository.Impl.driver.hibernateImpl.DriverRepositoryHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepositoryHibernate repository;
    public DriverServiceImpl()
    {

    }
    @Override
    public Set<Driver> getAll() {
        return new HashSet<>(this.repository.findAll());
    }

    @Override
    public Driver create(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public Driver read(String string) {
        return repository.findById(string).orElse(null);
    }

    @Override
    public Driver update(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public void delete(String string) {
        this.repository.deleteById(string);
    }

}
