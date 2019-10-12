package com.amoo.repository.Impl.vehicle;

import com.amoo.domain.vehicle.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("vehicle")
public class VehicleRepositoryImpl implements VehicleRepository{

    private static VehicleRepositoryImpl repository = null;
    Set<Vehicle> vehicles;

    public VehicleRepositoryImpl (){
        this.vehicles = new HashSet<>();
    }

    public static VehicleRepositoryImpl getVehicle(){
        if(repository == null) repository = new VehicleRepositoryImpl();
        return repository;
    }



    @Override
    public Set<Vehicle> getAll() {
        return null;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle read(String s) {
        return search(s);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle find = search(vehicle.getRegistration_no());
        if(vehicles.contains(find)){
            vehicles.remove(find);
            vehicles.add(vehicle);
        }
        return vehicle;
    }

    @Override
    public void delete(String s) {
        vehicles.remove(search(s));

    }

    public Vehicle search(String reg_Num){
        return vehicles.stream().filter(vehicles -> vehicles.getRegistration_no() == reg_Num).findAny().orElse(null);
    }
    
}
