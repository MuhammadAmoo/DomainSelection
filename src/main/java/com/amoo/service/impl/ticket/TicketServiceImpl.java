package com.amoo.service.impl.ticket;

import com.amoo.domain.Tickets.Ticket;
import com.amoo.repository.Impl.ticket.TicketsRepository;
import com.amoo.repository.Impl.ticket.TicketsRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketsRepository repository;

    private TicketServiceImpl(){this.repository = TicketsRepositoryImpl.getTicket();}

    @Override
    public Set<Ticket> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Ticket create(Ticket ticket) {
        return this.create(ticket);
    }

    @Override
    public Ticket read(Integer integer) {
        return this.repository.read(integer);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return this.update(ticket);
    }

    @Override
    public void delete(Integer integer) {this.repository.delete(integer);
    }
}
