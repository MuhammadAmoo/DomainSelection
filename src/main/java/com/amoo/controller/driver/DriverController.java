package com.amoo.controller.driver;

import com.amoo.domain.driver.Driver;
import com.amoo.service.impl.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/driver")
@CrossOrigin(origins="http://localhost:4200")
public class DriverController {

    @Autowired
    private DriverService service;

    @PostMapping("/create")
    public Driver create(@RequestBody Driver driver)
    {
        return service.create(driver);

    }

    @PutMapping("/update")
    public Driver update(@RequestBody Driver driver)
    {
        return service.create(driver);
    }

    @GetMapping("/find/{driver_no}")
    public Driver read(@PathVariable String driver_no){
        return service.read(driver_no);
    }

    @DeleteMapping("/delete/{driver_no}")
    public void delete(@PathVariable String driver_no)
    {
        service.delete(driver_no);

    }

    @GetMapping("/getall")
    public Set<Driver> getAll(){
        return service.getAll();
    }

}
