package com.amoo.controller.ticket;

import com.amoo.domain.ticket.Ticket;
import com.amoo.service.impl.ticket.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")


public class TicketController {

  @Autowired
  private TicketService service;

    @PostMapping("/create")
    @ResponseBody
    public Ticket create(Ticket ticket)
    {
        return service.create(ticket);

    }

    @PostMapping("/update")
    @ResponseBody
    public Ticket update(Ticket ticket)
    {
        return service.create(ticket);

    }

    @GetMapping("/delete/{ticket_no}")
    @ResponseBody
    public void delete(@PathVariable Integer ticket_no)
    {
        service.delete(ticket_no);

    }




}
