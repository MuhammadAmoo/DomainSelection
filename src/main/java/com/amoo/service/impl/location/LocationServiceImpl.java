package com.amoo.service.impl.location;


import com.amoo.domain.location.Location;
import com.amoo.repository.Impl.location.LocationRepository;
import com.amoo.repository.Impl.location.LocationRepositoryImpl;
import com.amoo.repository.Impl.location.hibernateImpl.LocationRepositoryHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("LocationServiceImpl")
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepositoryHibernate repository;

//    private LocationServiceImpl()
//    {
//        this.repository = LocationRepositoryHibernate.getLocation();
//    }


    @Override
    public Set<Location> getAll() {
        return new HashSet<>(this.repository.findAll());
    }

    @Override
    public Location create(Location location) {
        return this.create(location);
    }

    @Override
    public Location read(Integer integer) {
        return this.repository.findById(integer).orElse(null);
    }

    @Override
    public Location update(Location location) {
        return this.update(location);
    }

    @Override
    public void delete(Integer integer) {this.repository.deleteById(integer); }
}
