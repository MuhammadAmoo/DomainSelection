package com.amoo.controller.driver;

import com.amoo.domain.driver.Driver;
import com.amoo.factory.driver.DriverFactory;
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
public class DriverControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/driver";
    
    @Test
    public void create() {
        Driver driver = DriverFactory.getDriver("Muhammad","Amoo",23,"5","CA7891234");
        System.out.println(driver);

        ResponseEntity<Driver> postResponse = restTemplate.postForEntity(baseURL + "/create", driver, Driver.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        

    }

    @Test
    public void read() {
        Driver driver = restTemplate.getForObject(baseURL + "/read/5/", Driver.class);
        assertNotNull(driver); 
    }

    @Test
    public void update() {
        String id = "5";
        Driver driver = restTemplate.getForObject(baseURL + "/5/" + id, Driver.class);

        restTemplate.put(baseURL + "/5/" + id, Driver.class);
        Driver updatedDriver = restTemplate.getForObject(baseURL + "/update/" + id, Driver.class);
        assertNotNull(updatedDriver);
    }

    @Test
    public void delete() {
        String id = "5";
        Driver veh = restTemplate.getForObject(baseURL + "/5/" + id, Driver.class);
        assertNotNull(veh);
        restTemplate.delete(baseURL + "/driver/" + id);
        try
        {
            veh = restTemplate.getForObject(baseURL + "/ticket/" + id, Driver.class);
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

    @Test
    public void testSecurity() throws Exception{

        ResponseEntity<String> result = restTemplate.withBasicAuth("amoo", "amoo")
                .getForEntity(baseURL + "/getall", String.class);
        System.out.println(result);
        assertEquals(HttpStatus.OK, result.getStatusCode());

    }

}