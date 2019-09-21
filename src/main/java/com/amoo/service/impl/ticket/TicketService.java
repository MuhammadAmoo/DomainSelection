package com.amoo.service.impl.ticket;

import com.amoo.domain.ticket.Ticket;
import com.amoo.service.IService;

import java.util.Set;

public interface TicketService extends IService<Ticket, Integer> {
    Set<Ticket> getAll();
}
