package com.amoo.repository.Impl.vehicle;

import com.amoo.domain.vehicle.Vehicle;
import com.amoo.repository.IRepository;

import java.util.Set;

public interface VehicleRepository extends IRepository<Vehicle, String> {
        Set<Vehicle> getAll();



}
