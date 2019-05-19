package com.amoo.controller.vehicle;

import com.amoo.domain.Vehicles.Vehicle;
import com.amoo.service.impl.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")

public class VehicleController {
    @Autowired

    private VehicleService service;

    @PostMapping("/create")
    @ResponseBody
    public Vehicle create(Vehicle vehicle)
    {
        return service.create(vehicle);

    }

    @PostMapping("/update")
    @ResponseBody
    public Vehicle update(Vehicle vehicle)
    {
        return service.create(vehicle);

    }


    @GetMapping("/delete/{registration_no}")
    @ResponseBody
    public void delete(@PathVariable String registration_no)
    {
        service.delete(registration_no);

    }
    

}
