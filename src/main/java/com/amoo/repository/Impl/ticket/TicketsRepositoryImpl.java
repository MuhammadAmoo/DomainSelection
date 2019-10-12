package com.amoo.repository.Impl.ticket;

import com.amoo.domain.ticket.Ticket;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository
public class TicketsRepositoryImpl implements TicketsRepository {

    private static TicketsRepositoryImpl repository = null;
    private Set<Ticket> tickets;

    public TicketsRepositoryImpl (){
        this.tickets = new HashSet<>();
    }

    public static TicketsRepositoryImpl getTicket(){
        if(repository == null) repository = new TicketsRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Ticket> getAll() {
        return tickets;
    }

    @Override
    public Ticket create(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }

    @Override
    public Ticket read(Integer tickNum) {
        return search(tickNum);
    }

    @Override
    public Ticket update(Ticket ticket) {
        Ticket find = search(ticket.getTicket_no());
        if(tickets.contains(find)){
            tickets.remove(find);
            tickets.add(ticket);
        }
        return ticket;
    }

    @Override
    public void delete(Integer tickNum) {
        tickets.remove(search(tickNum));
    }

    public Ticket search(Integer tickNum){
        return tickets.stream().filter(Ticket -> Ticket.getTicket_no() == tickNum).findAny().orElse(null);
    }
}
