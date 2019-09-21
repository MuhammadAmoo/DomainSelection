package com.amoo.controller.location;

import com.amoo.domain.location.Location;
import com.amoo.service.impl.location.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")

public class LocationController {
    @Autowired

    private LocationService service;

    @PostMapping("/create")
    @ResponseBody
    public Location create(Location location)
    {
        return service.create(location);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Location read(@PathVariable Integer id) {
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Location update(Location location)
    {
        return service.create(location);

    }

    @GetMapping("/delete/{location_id}")
    @ResponseBody
    public void delete(@PathVariable Integer location_id)
    {
        service.delete(location_id);

    }



}
