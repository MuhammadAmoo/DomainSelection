package com.amoo.service.impl.ticket;

import com.amoo.domain.Tickets.Ticket;
import com.amoo.factory.TicketFactory;
import com.amoo.repository.Impl.ticket.TicketsRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketServiceImplTest {

    private TicketsRepositoryImpl repository;
    private Ticket getTicket;

    private Ticket getSaved() {
        return this.repository.getAll().iterator().next();

    }

    @Before
    public void setUp() throws Exception {
        this.repository = TicketsRepositoryImpl.getTicket();
        this.getTicket = (Ticket) TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Ticket created = this.repository.create(this.getTicket);
        assertNotNull(created);
        assertSame(created, this.getTicket);
    }

    @Test
    public void read() {
        Ticket ticket = this.repository.create(this.getTicket);
        repository.create(ticket);
        assertNotNull(repository.read(2));
        System.out.println(repository.getAll());


    }

    @Test
    public void update() {
        Ticket ticket = this.repository.create(this.getTicket);
        repository.create(ticket);
        Ticket updateTicket = TicketFactory.getTicket(1,"12/07/2018","16/07/2018");
        repository.update(updateTicket);
        assertEquals(updateTicket, repository.read(2));
        System.out.println(repository.getAll());
    }

    @Test
    public void delete() {
        Ticket ticket  = this.repository.create(this.getTicket);
        repository.create(ticket);
        System.out.println(repository.getAll());
    }

}