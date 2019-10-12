package com.amoo.repository.Impl.ticket;

import com.amoo.domain.ticket.Ticket;
import com.amoo.repository.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TicketsRepository extends IRepository<Ticket, Integer> {
    Set<Ticket> getAll();
}
