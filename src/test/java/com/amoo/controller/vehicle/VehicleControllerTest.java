package com.amoo.controller.vehicle;

import com.amoo.domain.vehicle.Vehicle;
import com.amoo.factory.vehicle.VehicleFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)



public class VehicleControllerTest {

    @Autowired
    private TestRestTemplate restTemp;
    private String URL="http://localhost:8080/vehicle";

    @Test
    public void create() {
        Vehicle vehicle = VehicleFactory.getVehicle(2011,"CA789245","ix35","Supreme");
        System.out.println(vehicle);

        ResponseEntity<Vehicle> postResponse = restTemp.postForEntity(URL + "/create", vehicle, Vehicle.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }


    @Test
    public void read() {
        Vehicle veh = restTemp.getForObject(URL + "/read/CA789245/", Vehicle.class);
        assertNotNull(veh);
    }


    @Test
    public void update() {
        String reg = "CA789245";
        Vehicle veh = restTemp.getForObject(URL + "/CA789245/" + reg, Vehicle.class);

        restTemp.put(URL + "/CA789245/" + reg, Vehicle.class);
        Vehicle updatedVehicle = restTemp.getForObject(URL + "/CA32517/" + reg, Vehicle.class);
        assertNotNull(updatedVehicle);
    }



    @Test
    public void delete() {
        String reg = "CA789245";
        Vehicle veh = restTemp.getForObject(URL + "/CA789245/" + reg, Vehicle.class);
        assertNotNull(veh);
        restTemp.delete(URL + "/CA789245/" + reg);
        try
        {
            veh = restTemp.getForObject(URL + "/CA789245/" + reg, Vehicle.class);
        }
        catch (final HttpClientErrorException e)
            {
                assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
            }

        }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemp.exchange(URL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    }
