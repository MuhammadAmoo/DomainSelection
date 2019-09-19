package com.amoo.repository.impl.ticket;

import com.amoo.domain.Tickets.Ticket;
import com.amoo.factory.TicketFactory;
import com.amoo.repository.Impl.location.LocationRepositoryImpl;
import com.amoo.repository.Impl.ticket.TicketsRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketsRepositoryImplTest {

    TicketsRepositoryImpl tick;

    @Before
    public void setUp() throws Exception {
        tick = TicketsRepositoryImpl.getTicket();
    }


    @Test
    public void create() {
        Ticket ticket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        tick.create(ticket);
        assertNotNull(tick.getAll());
        System.out.println(tick.getAll());
    }

    @Test
    public void read() {
        Ticket ticket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        tick.create(ticket);
        assertNotNull(tick.read(1));
        System.out.println(tick.read(1));
    }


    @Test
    public void update() {
        Ticket ticket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        tick.create(ticket);
        assertNotNull(tick.read(1));
        System.out.println(tick.read(1));

        Ticket updateticket = TicketFactory.getTicket(2,"12/07/2018","16/07/2018");
        tick.create(updateticket);
        assertNotNull(tick.read(2));
        System.out.println(tick.read(2));
    }

    @Test
    public void delete() {
        Ticket ticket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        tick.create(ticket);
        assertNotNull(tick.read(1));

        tick.delete(1);
        assertNull(tick.read(1));
        System.out.println(tick.getAll());

    }
}