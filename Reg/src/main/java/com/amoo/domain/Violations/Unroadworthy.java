package com.amoo.domain.Violations;

public class Unroadworthy {

    private int id;
    private String description;

    private Unroadworthy(){}


    private Unroadworthy(Unroadworthy.Builder builder) {
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

        public Unroadworthy.Builder id (int id){
            this.id = id;
            return this;
        }

        public Unroadworthy.Builder description (String description){
            this.description = description;
            return this;
        }

        public Unroadworthy build(){
            return new Unroadworthy(this);
        }

    }


}
