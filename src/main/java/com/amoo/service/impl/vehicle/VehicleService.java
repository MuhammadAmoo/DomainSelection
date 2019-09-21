package com.amoo.service.impl.vehicle;

import com.amoo.domain.vehicle.Vehicle;
import com.amoo.service.IService;

import java.util.Set;

public interface VehicleService extends IService<Vehicle, String> {
    Set<Vehicle> getAll();

}
