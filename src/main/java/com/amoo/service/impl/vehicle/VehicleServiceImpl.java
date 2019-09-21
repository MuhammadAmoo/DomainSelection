package com.amoo.service.impl.vehicle;

import com.amoo.domain.vehicle.Vehicle;
import com.amoo.repository.Impl.vehicle.VehicleRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("VehicleServiceImpl")
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleRepositoryImpl repository;

    private VehicleServiceImpl()
    {
        this.repository = VehicleRepositoryImpl.getVehicle();
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.create(vehicle);
    }

    @Override
    public Vehicle read(String string) {
        return this.repository.read(string);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.update(vehicle);
    }

    @Override
    public void delete(String string) {this.repository.delete(string);
    }

}
