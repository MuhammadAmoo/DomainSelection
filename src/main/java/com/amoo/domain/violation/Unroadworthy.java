package com.amoo.domain.violation;

public class Unroadworthy {

    private int id;
    private String description;

    private Unroadworthy(){}


    private Unroadworthy(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;

    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public static class Builder {
        private int id;
        private String description;

        public Builder id (int id){
            this.id = id;
            return this;
        }

        public Builder description (String description){
            this.description = description;
            return this;
        }

        public Unroadworthy build(){
            return new Unroadworthy(this);
        }

    }


}
