package com.amoo.controller.ticket;

import com.amoo.domain.ticket.Ticket;
import com.amoo.domain.vehicle.Vehicle;
import com.amoo.factory.ticket.TicketFactory;
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


public class TicketControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/ticket";

    @Test
    public void create() {
        Ticket ticket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        System.out.println(ticket);

        ResponseEntity<Ticket> postResponse = restTemplate.postForEntity(baseURL + "/create", ticket, Ticket.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    public void read() {
        Ticket ticket = restTemplate.getForObject(baseURL + "/read/1/", Ticket.class);
        assertNotNull(ticket);
    }

    @Test
    public void update() {
        String ticket_no = "1";
        Ticket ticket = restTemplate.getForObject(baseURL + "/1/" + ticket_no, Ticket.class);

        restTemplate.put(baseURL + "/1/" + ticket_no, Vehicle.class);
        Ticket updatedTicket = restTemplate.getForObject(baseURL + "/2/" + ticket_no, Ticket.class);
        assertNotNull(updatedTicket);
    }



    @Test
    public void delete() {
        String ticket_no = "CA789245";
        Ticket ticket = restTemplate.getForObject(baseURL + "/1/" + ticket_no, Ticket.class);
        assertNotNull(ticket);
        restTemplate.delete(baseURL + "/1/" + ticket_no);
        try
        {
            ticket = restTemplate.getForObject(baseURL + "/1/" + ticket_no, Ticket.class);
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