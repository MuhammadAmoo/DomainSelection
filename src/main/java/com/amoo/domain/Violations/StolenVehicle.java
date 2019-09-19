package com.amoo.domain.Violations;

public class StolenVehicle {

    private int id;
    private String desc;

    private StolenVehicle(){}


    private StolenVehicle(Builder builder) {
        this.id = builder.id;
        this.desc = builder.desc;

    }

        public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }


    public static class Builder {
        private int id;
        private String desc;

        public Builder id (int id){
            this.id = id;
            return this;
        }

        public Builder desc (String desc){
            this.desc = desc;
            return this;
        }

        public StolenVehicle build(){
            return new StolenVehicle(this);
        }

    }

    }
