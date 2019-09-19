package com.amoo.domain.Tickets;

public class Ticket {

    private int ticket_no;
    private String date_paid, date_cancelled;

    private Ticket(){}

    private Ticket(Ticket.Builder builder) {
        this.ticket_no = builder.ticket_no;
        this.date_paid = builder.date_paid;
        this.date_cancelled = builder.date_cancelled;

    }


    public int getTicket_no() {
        return ticket_no;
    }

    public String getDate_paid() {
        return date_paid;
    }

    public String getDate_cancelled() {
        return date_cancelled;
    }


    public static class Builder {
        private int ticket_no;
        private String date_paid, date_cancelled;


        public Ticket.Builder ticket_no (int ticket_no){
            this.ticket_no = ticket_no;
            return this;
        }

        public Ticket.Builder date_paid (String date_paid){
            this.date_paid = date_paid;
            return this;
        }

        public Ticket.Builder date_cancelled (String date_cancelled){
            this.date_cancelled = date_cancelled;
            return this;
        }


        public Ticket build() {
            return new Ticket(this);
        }
    }
    }
