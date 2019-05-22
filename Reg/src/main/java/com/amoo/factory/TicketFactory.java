package com.amoo.factory;

import com.amoo.domain.Tickets.Ticket;

public class TicketFactory {

    public static Ticket getTicket(int ticket_no, String date_paid, String date_cancelled){
        return new Ticket.Builder()
                   .ticket_no(ticket_no)
                   .date_paid(date_paid)
                   .date_cancelled(date_cancelled)
                   .build();


    }
}
