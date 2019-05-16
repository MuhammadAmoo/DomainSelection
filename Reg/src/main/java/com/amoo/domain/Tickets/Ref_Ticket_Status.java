package com.amoo.domain.Tickets;


public class Ref_Ticket_Status {

    private String status_description;
    private int status_id;

    private Ref_Ticket_Status(){}

    private Ref_Ticket_Status(Ref_Ticket_Status.Builder builder) {
        this.status_description = builder.status_description;
        this.status_id = builder.status_id;

    }


    public String getStatus_description() {
        return status_description;
    }

    public int getStatus_id() {
        return status_id;
    }

    public static class Builder {
        private String status_description;
        private int status_id;

        public Ref_Ticket_Status.Builder status_id (int status_id){
            this.status_id = status_id;
            return this;
        }

        public Ref_Ticket_Status.Builder status_description (String status_description){
            this.status_description = status_description;
            return this;
        }

        public Ref_Ticket_Status build() {
            return new Ref_Ticket_Status(this);
        }
    }
    }
