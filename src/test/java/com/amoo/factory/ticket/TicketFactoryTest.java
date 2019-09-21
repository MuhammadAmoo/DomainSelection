package com.amoo.factory.ticket;

import com.amoo.domain.ticket.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketFactoryTest {

    @Test
    public void getTicket() {
        Ticket ticket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        System.out.println(ticket);
        assertNotNull(ticket);
    }
}