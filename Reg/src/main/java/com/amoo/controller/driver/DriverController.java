package com.amoo.controller.driver;

import com.amoo.domain.Driver.Driver;
import com.amoo.service.impl.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")

public class DriverController {
    @Autowired

    private DriverService service;

    @PostMapping("/create")
    @ResponseBody
    public Driver create(Driver driver)
    {
        return service.create(driver);

    }

    @PostMapping("/update")
    @ResponseBody
    public Driver update(Driver driver)
    {
        return service.create(driver);

    }

    @GetMapping("/delete/{driver_no}")
    @ResponseBody
    public void delete(@PathVariable String driver_no)
    {
        service.delete(driver_no);

    }

}
