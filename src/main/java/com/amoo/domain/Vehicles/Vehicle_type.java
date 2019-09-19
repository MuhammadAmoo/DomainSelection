package com.amoo.domain.Vehicles;

public class Vehicle_type {

    private String type_code, description;

    private Vehicle_type(){}

    private Vehicle_type(Vehicle_type.Builder builder) {
        this.type_code = builder.type_code;
        this.description = builder.description;

    }


    public String getType_code() {
        return type_code;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String type_code, description;

        public Vehicle_type.Builder type_code(String type_code){
            this.type_code = type_code;
            return this;
        }


        public Vehicle_type.Builder description(String description){
            this.description = description;
            return this;
        }

        public Vehicle_type build() {
            return new Vehicle_type(this);
        }
    }


    }
