package com.amoo.service.impl.location;


import com.amoo.domain.Location.Location;
import com.amoo.repository.Impl.Impl.location.LocationRepository;
import com.amoo.repository.Impl.Impl.location.LocationRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LocationServiceImpl")
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository repository;

    private LocationServiceImpl()
    {
        this.repository = LocationRepositoryImpl.getLocation();
    }
    
    
    @Override
    public Set<Location> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Location create(Location location) {
        return this.create(location);
    }

    @Override
    public Location read(Integer integer) {
        return this.repository.read(integer);
    }

    @Override
    public Location update(Location location) {
        return this.update(location);
    }

    @Override
    public void delete(Integer integer) {this.repository.delete(integer);
    }
}
