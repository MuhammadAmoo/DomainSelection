package com.amoo.controller.location;

import com.amoo.domain.location.Location;
import com.amoo.factory.location.LocationFactory;
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

public class LocationControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/location";

    @Test
    public void create() {
        Location loc = LocationFactory.getLocation(7764,2,"Cape Town","Southern Suburbs","2 Turfall Street");
        System.out.println(loc);

        ResponseEntity<Location> postResponse = restTemplate.postForEntity(baseURL + "/create", loc, Location.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());



    }

    @Test
    public void read() {
        Location loc = restTemplate.getForObject(baseURL + "/location/2/", Location.class);
        assertNotNull(loc);
    }


    @Test
    public void update() {
        int location_id = 2;
        Location loc = restTemplate.getForObject(baseURL + "/location/" + location_id, Location.class);

        restTemplate.put(baseURL + "/update/" + location_id, Location.class);
        Location updatedLocation = restTemplate.getForObject(baseURL + "/update/" + location_id, Location.class);
        assertNotNull(updatedLocation);


    }

    @Test
    public void delete() {
        int location_id = 2;
        Location loc = restTemplate.getForObject(baseURL + "/delete/" + location_id, Location.class);
        assertNotNull(loc);
        restTemplate.delete(baseURL + "/delete/" + location_id, Location.class);
        try
        {
            loc = restTemplate.getForObject(baseURL + "/delete/" + loc, Location.class);
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
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

}