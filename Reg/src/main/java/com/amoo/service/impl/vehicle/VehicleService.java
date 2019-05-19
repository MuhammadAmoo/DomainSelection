package com.amoo.service.impl.vehicle;

import com.amoo.domain.Vehicles.Vehicle;
import com.amoo.service.IService;

import java.util.Set;

public interface VehicleService extends IService<Vehicle, String> {
    Set<Vehicle> getAll();

}
