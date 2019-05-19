package com.amoo.repository.Impl.Impl.ticket;

import com.amoo.domain.Tickets.Ticket;
import com.amoo.repository.Impl.IRepository;

import java.util.Set;

public interface TicketsRepository extends IRepository<Ticket, Integer> {
    Set<Ticket> getAll();
}
